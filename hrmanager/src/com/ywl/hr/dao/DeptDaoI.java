package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.Dept;

/**
 * 部门dao层
 * @author 龙
 *
 */
public interface DeptDaoI {

	/**
	 * 添加部门
	 */
	public void addDept(Dept dept);
	/**
	 * 修改部门
	 */
	public void updateDept(Dept dept);
	/**
	 * 查询所有部门
	 * @return
	 */
	public List<Dept> queryDept();
	/**
	 * 根据部门名查找
	 * @param name
	 * @return
	 */
	public List<Dept> queryDept(String name);
	/**
	 * 删除部门
	 * @param dept
	 */
	public void delDept(Dept dept);
	/**
	 * 根据id查找部门
	 * @param id
	 * @return
	 */
	public Dept queryById(int id);
}
