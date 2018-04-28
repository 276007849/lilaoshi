package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.Job;
/**
 * 职业dao层
 * @author 龙
 *
 */
public interface JobDaoI {

	/**
	 * 根据id查找职业
	 * @param id
	 * @return
	 */
	public Job queryById(int id);
	/**
	 * 删除职业
	 * @param parseInt
	 */
	public void delJob(Job job);
	/**
	 * 根据名字查找职业
	 * @param name
	 * @return
	 */
	public List<Job> query(String name);
	/**
	 * 查找全部职业
	 * @return
	 */
	public List<Job> query();
	/**
	 * 添加职业
	 * @param job
	 */
	public void addJob(Job job);
	/**
	 * 修改职业
	 * @param job
	 */
	public void updateJob(Job job);


}
