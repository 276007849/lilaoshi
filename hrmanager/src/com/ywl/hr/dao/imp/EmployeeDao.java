package com.ywl.hr.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ywl.hr.dao.EmployeeDaoI;
import com.ywl.hr.pojo.Employee;
@Repository
public class EmployeeDao implements EmployeeDaoI{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Employee queryById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee emp = session.get(Employee.class, id);
		return emp;
	}

	@Override
	public List<Employee> query() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select e from Employee e");
		return query.list();
	}

	@Override
	public List<Employee> queryByHql(String hql) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		return query.list();
	}

	@Override
	public void updateEmp(Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		session.update(emp);
		
	}

	@Override
	public void addEmp(Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		session.save(emp);
		
	}

	@Override
	public void delEmp(Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(emp);
		
	}

}
