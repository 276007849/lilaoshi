package com.ywl.hr.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ywl.hr.dao.JobDaoI;
import com.ywl.hr.pojo.Employee;
import com.ywl.hr.pojo.Job;
@Repository
public class JobDao implements JobDaoI{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Job queryById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Job job=session.get(Job.class, id);
		return job;
	}

	@Override
	public void delJob(Job job) {
		Session session = sessionFactory.getCurrentSession();
		Query query1 = session.createQuery("select e from Employee e where e.job.id=?");
		query1.setInteger(0, job.getId());
		List<Employee> list1 = query1.list();
		if(list1!=null)
		{
			for(Employee e:list1)
			{
				session.delete(e);
			}
		}
		session.delete(job);
	}

	@Override
	public List<Job> query(String name) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select j from Job j where j.name like ?");
		query.setString(0, name);
		return query.list();
	}

	@Override
	public List<Job> query() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select j from Job j ");
		return query.list();
	}

	@Override
	public void addJob(Job job) {
		Session session = sessionFactory.getCurrentSession();
		session.save(job);
		
	}

	@Override
	public void updateJob(Job job) {
		Session session = sessionFactory.getCurrentSession();
		session.update(job);
	}

}
