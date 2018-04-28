package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.Employee;
/**
 * ְԱdao��
 * @author ��
 *
 */
public interface EmployeeDaoI {

	/**
	 * ����id����ְԱ
	 * @param id
	 * @return
	 */
	public Employee queryById(int id);
	/**
	 * ��������ְԱ
	 * @return
	 */
	public List<Employee> query();
	/**
	 * ����hql���Բ���ְԱ
	 * @param name
	 * @return
	 */
	public List<Employee> queryByHql(String hql);
	/**
	 * �޸�ְԱ��Ϣ
	 * @param emp
	 */
	public void updateEmp(Employee emp);
	/**
	 * ���ְԱ
	 * @param emp
	 */
	public void addEmp(Employee emp);
	/**
	 * ɾ��ְԱ
	 * @param emp
	 */
	public void delEmp(Employee emp);
}
