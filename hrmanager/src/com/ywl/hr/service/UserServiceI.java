package com.ywl.hr.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.User;

/**
 * �û�ҵ���߼���
 * @author ��
 *
 */
public interface UserServiceI {

	/**
	 * ����û�
	 * @param user
	 * @throws Exception
	 */
	public void addUser(User user)throws Exception;
	/**
	 * ɾ���û�
	 * @param ids
	 * @throws Exception
	 */
	public void delUser(String ids)throws Exception;
	/**
	 * �û���¼
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean loginUser(User user,HttpSession session)throws Exception;
	/**
	 * �޸��û�
	 * @param user
	 * @throws Exception
	 */
	public void updateUser(User user)throws Exception;
	/**
	 * �����û�
	 */
	public void queryUser(User user,Model mav)throws Exception;
	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User queryById(int id) throws Exception;
}
