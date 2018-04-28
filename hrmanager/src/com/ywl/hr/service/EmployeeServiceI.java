package com.ywl.hr.service;

import org.springframework.ui.Model;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.Employee;

/**
 * 职员业务逻辑层
 * @author 龙
 *
 */
public interface EmployeeServiceI {

	/**
	 * 得到所有部门
	 * @param model
	 * @throws Exception
	 */
	public void getDepts(Model model ,String name)throws Exception;
	
	/**
	 * 得到所有职业
	 * @param modle
	 * @throws Exception
	 */
	public void getJobs(Model modle,String name)throws Exception;
	/**
	 * 查询职员
	 * @param model
	 * @param emp
	 * @throws Exception
	 */
	public void showEmp(Model model ,Employee emp,String name)throws Exception;
	/**
	 * 修改职员
	 * @param emp
	 * @throws Exception
	 */
	public void updateEmp(Employee emp)throws Exception;
	/**
	 * 根据id删除
	 * @param ids
	 * @throws Exception
	 */
	public void delEmp(String ids)throws Exception;
	/**
	 * 添加职员
	 * @param emp
	 * @throws Exception
	 */
	public void addEmp(Employee emp)throws Exception;
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Employee queryById(int id) throws Exception;
}
