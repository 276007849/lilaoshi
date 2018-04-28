package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.User;

/**
 * 用户dao层的接口
 * @author 龙
 *
 */
public interface UserDaoI {

	/**
	 * 添加用户
	 * @param user
	 */
	public void add(User user) ;
	/**
	 * 修改用户
	 * @param user
	 */
	public void update(User user) ;
	/**
	 * 删除用户
	 * @param user
	 */
	public void delUser(User user);
	/**
	 * 根据id查找用户
	 * @param id
	 * @return
	 */
	public User query(int id);
	/**
	 * 根据用户名和密码查找用户
	 * @param username
	 * @param password
	 * @return
	 */
	public User query(String loginName,String password);
	/**
	 * 根据用户名和状态查询
	 * @param username
	 * @param status
	 * @return
	 */
	public List<User> query(String username,int status);
	/**
	 * 根据状态查询
	 * @param status
	 * @return
	 */
	public List<User> queryByStatus(int status);
	/**
	 * 根据用户名查询
	 * @param username
	 * @return
	 */
	public List<User> query(String username);
	/**
	 * 查询全部
	 * @return
	 */
	public List<User> query();
}
