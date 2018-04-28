package com.ywl.hr.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ywl.hr.dao.NoticeDaoI;
import com.ywl.hr.pojo.Notice;
@Repository
public class NoticeDao implements NoticeDaoI{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Notice queryById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Notice notice = session.get(Notice.class, id);
		return notice;
	}

	@Override
	public List<Notice> query() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select n from Notice n");
		return query.list();
	}

	@Override
	public void updateNotice(Notice notice) {
		Session session = sessionFactory.getCurrentSession();
		session.update(notice);
	}

	@Override
	public void addNotice(Notice notice) {
		Session session = sessionFactory.getCurrentSession();
		session.save(notice);
	}

	@Override
	public void delNotice(Notice notice) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(notice);
	}

	@Override
	public List<Notice> queryByHql(String hql) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		return query.list();
	}

}
