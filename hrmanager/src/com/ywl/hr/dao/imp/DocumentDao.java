package com.ywl.hr.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ywl.hr.dao.DocumentDaoI;
import com.ywl.hr.pojo.Document;
@Repository
public class DocumentDao implements DocumentDaoI{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Document queryById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Document document = session.get(Document.class, id);
		return document;
	}

	@Override
	public List<Document> query() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select d from Document d");
		return query.list();
	}

	@Override
	public List<Document> queryByTitle(String title) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select d from Document d where d.title like ?");
		query.setString(0, "%"+title+"%");
		return query.list();
	}

	@Override
	public void updateDocument(Document document) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(document);
	}

	@Override
	public void addDocument(Document document) {
		Session session = sessionFactory.getCurrentSession();
		session.save(document);
	}

	@Override
	public void delDocument(Document document) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(document);
	}

}
