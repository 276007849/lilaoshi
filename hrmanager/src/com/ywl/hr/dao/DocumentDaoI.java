package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.Document;

/**
 * 文档dao层
 * @author 龙
 *
 */
public interface DocumentDaoI {

	/**
	 * 根据id找到文档
	 * @param id
	 * @return
	 */
	public Document queryById(int id);
	/**
	 * 查找所有的文档
	 * @return
	 */
	public List<Document> query();
	/**
	 * 根据标题查询
	 * @param title
	 * @return
	 */
	public List<Document> queryByTitle(String title);
	/**
	 * 修改文档
	 * @param document
	 */
	public void updateDocument(Document document);
	/**
	 * 添加文档
	 * @param document
	 */
	public void addDocument(Document document);
	/**
	 * 删除文档
	 * @param ids
	 */
	public void delDocument(Document document);
}
