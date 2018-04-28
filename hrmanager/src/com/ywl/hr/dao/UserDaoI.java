package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.User;

/**
 * �û�dao��Ľӿ�
 * @author ��
 *
 */
public interface UserDaoI {

	/**
	 * ����û�
	 * @param user
	 */
	public void add(User user) ;
	/**
	 * �޸��û�
	 * @param user
	 */
	public void update(User user) ;
	/**
	 * ɾ���û�
	 * @param user
	 */
	public void delUser(User user);
	/**
	 * ����id�����û�
	 * @param id
	 * @return
	 */
	public User query(int id);
	/**
	 * �����û�������������û�
	 * @param username
	 * @param password
	 * @return
	 */
	public User query(String loginName,String password);
	/**
	 * �����û�����״̬��ѯ
	 * @param username
	 * @param status
	 * @return
	 */
	public List<User> query(String username,int status);
	/**
	 * ����״̬��ѯ
	 * @param status
	 * @return
	 */
	public List<User> queryByStatus(int status);
	/**
	 * �����û�����ѯ
	 * @param username
	 * @return
	 */
	public List<User> query(String username);
	/**
	 * ��ѯȫ��
	 * @return
	 */
	public List<User> query();
}
