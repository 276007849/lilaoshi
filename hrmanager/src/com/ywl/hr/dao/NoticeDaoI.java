package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.Notice;

/**
 * �����Dao��
 * @author ��
 *
 */
public interface NoticeDaoI {

	/**
	 * ͨ��id�����û�
	 * @param id
	 * @return
	 */
	public Notice queryById(int id);
	/**
	 * �õ����е��û�
	 * @return
	 */
	public List<Notice> query();
	/**
	 * �޸Ĺ���
	 * @param notice
	 */
	public void updateNotice(Notice notice);
	/**
	 * ��ӹ���
	 * @param notice
	 */
	public void addNotice(Notice notice);
	/**
	 * ɾ������
	 * @param notice
	 */
	public void delNotice(Notice notice);
	/**
	 * ����hql���Բ�ѯ
	 * @param hql
	 * @return
	 */
	public List<Notice> queryByHql(String hql);
}
