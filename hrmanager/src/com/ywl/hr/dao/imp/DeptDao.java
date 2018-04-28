package com.ywl.hr.dao.imp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ywl.hr.dao.DeptDaoI;
import com.ywl.hr.pojo.Dept;
import com.ywl.hr.pojo.Employee;
import com.ywl.hr.pojo.Notice;

/**
 * ≤ø√≈dao≤„
 * @author 
 *
 */
@Repository
public class DeptDao implements DeptDaoI{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addDept(Dept dept) {
		Session session = sessionFactory.getCurrentSession();
		session.save(dept);
		
	}

	@Override
	public void updateDept(Dept dept) {
		Session session = sessionFactory.getCurrentSession();
		session.update(dept);
		
	}

	@Override
	public List<Dept> queryDept() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select d from Dept d");
		return query.list();
	}

	@Override
	public List<Dept> queryDept(String name) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select d from Dept d where d.name like ?");
		query.setString(0, "%"+name+"%");
		return query.list();
	}

	@Override
	public void delDept(Dept dept) {
		Session session = sessionFactory.getCurrentSession();
		Query query1 = session.createQuery("select e from Employee e where e.dept.id=?");
		query1.setInteger(0, dept.getId());
		List<Employee> list1 = query1.list();
		if(list1!=null)
		{
			for(Employee e:list1)
			{
				session.delete(e);
			}
		}
		session.delete(dept);
	}

	@Override
	public Dept queryById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Dept.class,id);
	} 
}
