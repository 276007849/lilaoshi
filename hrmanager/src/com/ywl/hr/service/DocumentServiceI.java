package com.ywl.hr.service;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import com.ywl.hr.pojo.Document;

/**
 * �ĵ���ҵ���߼���
 * @author ��
 *
 */
public interface DocumentServiceI {

	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Document queryById(int id) throws Exception;
	/**
	 * ��ѯ�ĵ�,����ֵ����ǰ��
	 * @param model
	 * @param name
	 * @throws Exception
	 */
	public void showDocument(Model model,String name,Document document)throws Exception;
	/**
	 * �޸��ĵ�
	 * @param document
	 * @throws Exception
	 */
	public void updateDocument(Document document)throws Exception;
	/**
	 * ����ĵ�
	 * @param document
	 * @throws Exception
	 */
	public void addDocument(Document document)throws Exception;
	/**
	 * ɾ���ĵ�
	 * @param ids
	 * @throws Exception
	 */
	public void delDocument(String ids)throws Exception;
	/**
	 * �����ĵ�
	 * @param doc
	 * @return 
	 * @throws Exception
	 */
	public Document downDoc(Document doc)throws Exception;
}
