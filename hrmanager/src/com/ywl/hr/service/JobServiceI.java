package com.ywl.hr.service;

import org.springframework.ui.Model;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.Job;
/**
 * 职业业务逻辑层
 * @author 龙
 *
 */
public interface JobServiceI {

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Job queryById(int id) throws Exception;

	/**
	 * 修改职业
	 * @param job
	 */
	public void updateJob(Job job)throws Exception;

	/**
	 * 添加职业
	 * @param job
	 */
	public void addJob(Job job)throws Exception;
	/**
	 * 显示职业
	 * @param job
	 * @param model
	 * @param string
	 */
	public void showJob(Job job, Model model, String string)throws Exception;
	/**
	 * 删除职业
	 * @param ids
	 * @throws Exception
	 */
	public void delJob(String ids)throws Exception;


}
