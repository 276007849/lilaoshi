package com.ywl.hr.service;

import org.springframework.ui.Model;

import com.ywl.hr.pojo.Document;
import com.ywl.hr.pojo.Notice;

public interface NoticeServiceI {

	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Notice queryById(int id) throws Exception;
	/**
	 * ��ӹ���
	 * @param notice
	 * @throws Exception
	 */
	public void addNotice(Notice notice)throws Exception;
	/**
	 * ����ҳ�洫������id����ɾ������
	 * @param ids
	 * @throws Exception
	 */
	public void delNotice(String ids)throws Exception;
	/**
	 * �޸Ĺ���
	 * @param notice
	 * @throws Exception
	 */
	public void updateNotice(Notice notice)throws Exception;
	/**
	 * Ԥ������
	 * @param id
	 * @throws Exception
	 */
	public void preNotice(String id)throws Exception;
	/**
	 * ��ѯ����
	 * @param notice
	 * @param model
	 * @throws Exception
	 */
	public void showNotice(Notice notice,Model model,String name)throws Exception;
}
