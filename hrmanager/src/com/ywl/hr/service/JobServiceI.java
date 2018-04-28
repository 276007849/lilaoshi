package com.ywl.hr.service;

import org.springframework.ui.Model;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.Job;
/**
 * ְҵҵ���߼���
 * @author ��
 *
 */
public interface JobServiceI {

	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Job queryById(int id) throws Exception;

	/**
	 * �޸�ְҵ
	 * @param job
	 */
	public void updateJob(Job job)throws Exception;

	/**
	 * ���ְҵ
	 * @param job
	 */
	public void addJob(Job job)throws Exception;
	/**
	 * ��ʾְҵ
	 * @param job
	 * @param model
	 * @param string
	 */
	public void showJob(Job job, Model model, String string)throws Exception;
	/**
	 * ɾ��ְҵ
	 * @param ids
	 * @throws Exception
	 */
	public void delJob(String ids)throws Exception;


}
