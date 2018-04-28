package com.ywl.hr.service;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import com.ywl.hr.pojo.Document;

/**
 * 文档的业务逻辑层
 * @author 龙
 *
 */
public interface DocumentServiceI {

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Document queryById(int id) throws Exception;
	/**
	 * 查询文档,并将值传到前端
	 * @param model
	 * @param name
	 * @throws Exception
	 */
	public void showDocument(Model model,String name,Document document)throws Exception;
	/**
	 * 修改文档
	 * @param document
	 * @throws Exception
	 */
	public void updateDocument(Document document)throws Exception;
	/**
	 * 添加文档
	 * @param document
	 * @throws Exception
	 */
	public void addDocument(Document document)throws Exception;
	/**
	 * 删除文档
	 * @param ids
	 * @throws Exception
	 */
	public void delDocument(String ids)throws Exception;
	/**
	 * 下载文档
	 * @param doc
	 * @return 
	 * @throws Exception
	 */
	public Document downDoc(Document doc)throws Exception;
}
