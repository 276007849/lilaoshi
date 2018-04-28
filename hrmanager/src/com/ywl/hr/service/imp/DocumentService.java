package com.ywl.hr.service.imp;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.ywl.hr.dao.DocumentDaoI;
import com.ywl.hr.pojo.Document;
import com.ywl.hr.service.DocumentServiceI;
@Service
@Transactional
public class DocumentService implements DocumentServiceI{

	@Autowired
	private DocumentDaoI docDao;

	@Override
	public void showDocument(Model model, String name, Document document) throws Exception {
		if(document.getTitle()==null||"".equals(document.getTitle()))
		{
			List<Document> list = docDao.query();
			model.addAttribute(name, list);
		}
		else
		{
			List<Document> list = docDao.queryByTitle(document.getTitle());
			model.addAttribute(name, list);
		}
		
	}

	@Override
	public void updateDocument(Document document) throws Exception {
		Document doc1 = docDao.queryById(document.getId());
		document.setUser(doc1.getUser());
		document.setCreateDate(doc1.getCreateDate());
		System.out.println("service:"+document);
		docDao.updateDocument(document);
		
	}

	@Override
	public void addDocument(Document document) throws Exception {
		document.setCreateDate(new Date());
		docDao.addDocument(document);
	}

	@Override
	public void delDocument(String ids) throws Exception {
		String[] strs=ids.split(",");
		for(String id:strs)
		{
			Document doc = docDao.queryById(Integer.parseInt(id));
			docDao.delDocument(doc);
		}
		
	}

	@Override
	public Document downDoc(Document doc) throws Exception {
		Document doc1 = docDao.queryById(doc.getId());
		return doc1;
		
	}

	@Override
	public Document queryById(int id) throws Exception {
		return docDao.queryById(id);
	}

}
