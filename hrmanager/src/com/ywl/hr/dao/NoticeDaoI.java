package com.ywl.hr.dao;

import java.util.List;

import com.ywl.hr.pojo.Notice;

/**
 * 公告的Dao层
 * @author 龙
 *
 */
public interface NoticeDaoI {

	/**
	 * 通过id查找用户
	 * @param id
	 * @return
	 */
	public Notice queryById(int id);
	/**
	 * 得到所有的用户
	 * @return
	 */
	public List<Notice> query();
	/**
	 * 修改公告
	 * @param notice
	 */
	public void updateNotice(Notice notice);
	/**
	 * 添加公告
	 * @param notice
	 */
	public void addNotice(Notice notice);
	/**
	 * 删除公告
	 * @param notice
	 */
	public void delNotice(Notice notice);
	/**
	 * 根据hql语言查询
	 * @param hql
	 * @return
	 */
	public List<Notice> queryByHql(String hql);
}
