package com.ywl.hr.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.User;

/**
 * 用户业务逻辑层
 * @author 龙
 *
 */
public interface UserServiceI {

	/**
	 * 添加用户
	 * @param user
	 * @throws Exception
	 */
	public void addUser(User user)throws Exception;
	/**
	 * 删除用户
	 * @param ids
	 * @throws Exception
	 */
	public void delUser(String ids)throws Exception;
	/**
	 * 用户登录
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean loginUser(User user,HttpSession session)throws Exception;
	/**
	 * 修改用户
	 * @param user
	 * @throws Exception
	 */
	public void updateUser(User user)throws Exception;
	/**
	 * 查找用户
	 */
	public void queryUser(User user,Model mav)throws Exception;
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User queryById(int id) throws Exception;
}
