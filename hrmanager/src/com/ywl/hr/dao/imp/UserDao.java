package com.ywl.hr.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ywl.hr.dao.UserDaoI;
import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.Notice;
import com.ywl.hr.pojo.User;
@Repository
public class UserDao implements UserDaoI{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void add(User user)  {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}


	@Override
	public void update(User user)  {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);;
	}

	@Override
	public User query(int id) {
		Query query = sessionFactory.getCurrentSession().createQuery("select u from User u where u.id=?");
		query.setInteger(0, id);
		List<User> list=query.list();
		if(list.isEmpty())
		{
			return null;
		}
		return list.get(0);
	}
	@Override
	public User query(String logiNname, String password) {
		Query query = sessionFactory.getCurrentSession().createQuery("select u from User u where u.loginName=:un and u.password=:pwd");
		query.setParameter("un", logiNname);
		query.setParameter("pwd", password);
		List<User> list=query.list();
		if(list.isEmpty())
		{
			return null;
		}
		return list.get(0);
	}
	@Override
	public List<User> query(String username, int status) {
		Query query = sessionFactory.getCurrentSession().createQuery("select u from User u where u.status=? and u.userName like ?");
		query.setString(1,"%"+username+"%");
		query.setInteger(0, status);
		return query.list();
	}
	@Override
	public List<User> queryByStatus(int status) {
		Query query = sessionFactory.getCurrentSession().createQuery("select u from User u where u.status=? ");
		query.setInteger(0, status);
		return query.list();
	}
	@Override
	public List<User> query(String username) {
		Query query = sessionFactory.getCurrentSession().createQuery("select u from User u where u.userName like ?");
		query.setString(0, "%"+username+"%");
		return query.list();
	}
	@Override
	public List<User> query() {
		Query query = sessionFactory.getCurrentSession().createQuery("select u from User u ");
		return query.list();
	}
	@Override
	public void delUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		Query query1 = session.createQuery("select n from Notice n where n.user.id=?");
		query1.setInteger(0, user.getId());
		Query query2 = session.createQuery("select d from Document d where d.user.id=?");
		query2.setInteger(0, user.getId());
		List<Notice> list1 = query1.list();
		List<Document> list2 = query2.list();
		System.out.println(list1);
		System.out.println(list2);
		if(list1!=null)
		{
			for(Notice n:list1)
			{
				session.delete(n);
			}
		}
		if(list2!=null)
		{
			for(Document d:list2)
			{
				session.delete(d);
			}
		}
		session.delete(user);
	}

}
