package com.ywl.hr.service;

import org.springframework.ui.Model;

import com.ywl.hr.pojo.Dept;

/**
 * ����ҵ���߼���
 * @author ��
 *
 */
public interface DeptServiceI {

	/**
	 * ����id��ѯ
	 * @param id
	 * @throws Exception
	 */
	public Dept queryById(int id)throws Exception;
	/**
	 * ��Ӳ���
	 * @param dept
	 * @throws Exception
	 */
	public void addDept(Dept dept) throws Exception;
	/**
	 * ɾ������
	 * @param ids
	 * @throws Exception
	 */
	public void delDept(String ids) throws Exception;
	/**
	 * �޸Ĳ���
	 * @param dept
	 * @throws Exception
	 */
	public void updateDept(Dept dept) throws Exception;
	/**
	 * ��ʾ����
	 * @param dept
	 * @param model
	 * @param name
	 * @throws Exception
	 */
	public void showDept(Dept dept ,Model model,String name) throws Exception;
}
