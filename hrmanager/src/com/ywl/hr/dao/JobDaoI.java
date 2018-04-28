package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.Job;
/**
 * ְҵdao��
 * @author ��
 *
 */
public interface JobDaoI {

	/**
	 * ����id����ְҵ
	 * @param id
	 * @return
	 */
	public Job queryById(int id);
	/**
	 * ɾ��ְҵ
	 * @param parseInt
	 */
	public void delJob(Job job);
	/**
	 * �������ֲ���ְҵ
	 * @param name
	 * @return
	 */
	public List<Job> query(String name);
	/**
	 * ����ȫ��ְҵ
	 * @return
	 */
	public List<Job> query();
	/**
	 * ���ְҵ
	 * @param job
	 */
	public void addJob(Job job);
	/**
	 * �޸�ְҵ
	 * @param job
	 */
	public void updateJob(Job job);


}
