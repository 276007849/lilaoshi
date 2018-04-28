package com.ywl.hr.service;

import org.springframework.ui.Model;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.Employee;

/**
 * ְԱҵ���߼���
 * @author ��
 *
 */
public interface EmployeeServiceI {

	/**
	 * �õ����в���
	 * @param model
	 * @throws Exception
	 */
	public void getDepts(Model model ,String name)throws Exception;
	
	/**
	 * �õ�����ְҵ
	 * @param modle
	 * @throws Exception
	 */
	public void getJobs(Model modle,String name)throws Exception;
	/**
	 * ��ѯְԱ
	 * @param model
	 * @param emp
	 * @throws Exception
	 */
	public void showEmp(Model model ,Employee emp,String name)throws Exception;
	/**
	 * �޸�ְԱ
	 * @param emp
	 * @throws Exception
	 */
	public void updateEmp(Employee emp)throws Exception;
	/**
	 * ����idɾ��
	 * @param ids
	 * @throws Exception
	 */
	public void delEmp(String ids)throws Exception;
	/**
	 * ���ְԱ
	 * @param emp
	 * @throws Exception
	 */
	public void addEmp(Employee emp)throws Exception;
	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Employee queryById(int id) throws Exception;
}
