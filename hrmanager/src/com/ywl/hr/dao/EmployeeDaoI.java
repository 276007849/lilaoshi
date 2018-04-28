package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.Employee;
/**
 * 职员dao层
 * @author 龙
 *
 */
public interface EmployeeDaoI {

	/**
	 * 根据id查找职员
	 * @param id
	 * @return
	 */
	public Employee queryById(int id);
	/**
	 * 查找所有职员
	 * @return
	 */
	public List<Employee> query();
	/**
	 * 根据hql语言查找职员
	 * @param name
	 * @return
	 */
	public List<Employee> queryByHql(String hql);
	/**
	 * 修改职员信息
	 * @param emp
	 */
	public void updateEmp(Employee emp);
	/**
	 * 添加职员
	 * @param emp
	 */
	public void addEmp(Employee emp);
	/**
	 * 删除职员
	 * @param emp
	 */
	public void delEmp(Employee emp);
}
