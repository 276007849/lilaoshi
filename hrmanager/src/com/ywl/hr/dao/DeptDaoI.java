package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.Dept;

/**
 * ����dao��
 * @author ��
 *
 */
public interface DeptDaoI {

	/**
	 * ��Ӳ���
	 */
	public void addDept(Dept dept);
	/**
	 * �޸Ĳ���
	 */
	public void updateDept(Dept dept);
	/**
	 * ��ѯ���в���
	 * @return
	 */
	public List<Dept> queryDept();
	/**
	 * ���ݲ���������
	 * @param name
	 * @return
	 */
	public List<Dept> queryDept(String name);
	/**
	 * ɾ������
	 * @param dept
	 */
	public void delDept(Dept dept);
	/**
	 * ����id���Ҳ���
	 * @param id
	 * @return
	 */
	public Dept queryById(int id);
}
