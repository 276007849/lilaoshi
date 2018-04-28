package com.ywl.hr.service;

import org.springframework.ui.Model;

import com.ywl.hr.pojo.Dept;

/**
 * 部门业务逻辑层
 * @author 龙
 *
 */
public interface DeptServiceI {

	/**
	 * 根据id查询
	 * @param id
	 * @throws Exception
	 */
	public Dept queryById(int id)throws Exception;
	/**
	 * 添加部门
	 * @param dept
	 * @throws Exception
	 */
	public void addDept(Dept dept) throws Exception;
	/**
	 * 删除部门
	 * @param ids
	 * @throws Exception
	 */
	public void delDept(String ids) throws Exception;
	/**
	 * 修改部门
	 * @param dept
	 * @throws Exception
	 */
	public void updateDept(Dept dept) throws Exception;
	/**
	 * 显示部门
	 * @param dept
	 * @param model
	 * @param name
	 * @throws Exception
	 */
	public void showDept(Dept dept ,Model model,String name) throws Exception;
}
