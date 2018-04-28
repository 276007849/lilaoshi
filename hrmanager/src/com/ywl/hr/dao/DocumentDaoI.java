package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.Document;

/**
 * �ĵ�dao��
 * @author ��
 *
 */
public interface DocumentDaoI {

	/**
	 * ����id�ҵ��ĵ�
	 * @param id
	 * @return
	 */
	public Document queryById(int id);
	/**
	 * �������е��ĵ�
	 * @return
	 */
	public List<Document> query();
	/**
	 * ���ݱ����ѯ
	 * @param title
	 * @return
	 */
	public List<Document> queryByTitle(String title);
	/**
	 * �޸��ĵ�
	 * @param document
	 */
	public void updateDocument(Document document);
	/**
	 * ����ĵ�
	 * @param document
	 */
	public void addDocument(Document document);
	/**
	 * ɾ���ĵ�
	 * @param ids
	 */
	public void delDocument(Document document);
}
