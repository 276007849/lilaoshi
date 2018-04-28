package com.ywl.hr.service.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.ywl.hr.dao.NoticeDaoI;
import com.ywl.hr.pojo.Notice;
import com.ywl.hr.service.NoticeServiceI;
@Service
@Transactional
public class NoticeService implements NoticeServiceI{

	@Autowired
	private NoticeDaoI noticeDao;

	@Override
	public void addNotice(Notice notice) throws Exception {
		notice.setCreateDate(new Date());
		noticeDao.addNotice(notice);		
	}

	@Override
	public void delNotice(String ids) throws Exception {
		
		String[] strs=ids.split(",");
		for(String id:strs)
		{
			Notice notice = noticeDao.queryById(Integer.parseInt(id));
			noticeDao.delNotice(notice);
		}
	}

	@Override
	public void updateNotice(Notice notice) throws Exception {
		noticeDao.updateNotice(notice);
		
	}

	@Override
	public void preNotice(String id) throws Exception {
		int id1=Integer.parseInt(id);
		
		
	}

	@Override
	public void showNotice(Notice notice, Model model,String name) throws Exception {
		String hql=getHql(notice);
		if(hql!=null)
		{
			List<Notice> list = noticeDao.queryByHql(hql);
			model.addAttribute(name, list);
		}
		else
		{
			List<Notice> list = noticeDao.query();
			model.addAttribute(name, list);
		}
		
	}
	public String getHql(Notice notice)
	{
		String hql="select n from Notice n where";
		if(!"".equals(notice.getTitle())&&notice.getTitle()!=null)
		{
			hql=hql+" n.title like '%"+notice.getTitle()+"%' and ";
		}
		if(!"".equals(notice.getContent())&&notice.getContent()!=null)
		{
			hql=hql+" n.content like '%"+notice.getContent()+"%' and ";
		}
		if("select n from Notice n where".equals(hql))
		{
			hql=null;
		}
		else
		{
			hql=hql.substring(0, hql.length()-4);
		}
		System.out.println(hql);
		return hql;
		
	}

	@Override
	public Notice queryById(int id) throws Exception {
		return noticeDao.queryById(id);
	}

}
