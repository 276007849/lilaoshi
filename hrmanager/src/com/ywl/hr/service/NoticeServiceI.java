package com.ywl.hr.service;

import org.springframework.ui.Model;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.Notice;

public interface NoticeServiceI {

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Notice queryById(int id) throws Exception;
	/**
	 * 添加公告
	 * @param notice
	 * @throws Exception
	 */
	public void addNotice(Notice notice)throws Exception;
	/**
	 * 根据页面传过来的id数组删除公告
	 * @param ids
	 * @throws Exception
	 */
	public void delNotice(String ids)throws Exception;
	/**
	 * 修改公告
	 * @param notice
	 * @throws Exception
	 */
	public void updateNotice(Notice notice)throws Exception;
	/**
	 * 预览公告
	 * @param id
	 * @throws Exception
	 */
	public void preNotice(String id)throws Exception;
	/**
	 * 查询公告
	 * @param notice
	 * @param model
	 * @throws Exception
	 */
	public void showNotice(Notice notice,Model model,String name)throws Exception;
}
