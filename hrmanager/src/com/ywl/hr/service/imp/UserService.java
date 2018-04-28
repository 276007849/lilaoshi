package com.ywl.hr.service.imp;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.ywl.hr.dao.UserDaoI;
import com.ywl.hr.pojo.User;
import com.ywl.hr.service.UserServiceI;
@Service
@Transactional
public class UserService implements UserServiceI{

	@Autowired
	private UserDaoI userDao;
	@Override
	public void addUser(User user) throws Exception {
		if("".equals(user.getLoginName())||"".equals(user.getLoginName()))
		{
			throw new RuntimeException("Êý¾ÝÒì³£");
		}
		userDao.add(user);
	}
	
	@Override
	public void updateUser(User user) throws Exception {
		User user1=userDao.query(user.getId());
		if(user1!=null)
		{
			user1.setLoginName(user.getLoginName());
			user1.setPassword(user.getPassword());
			user1.setStatus(user.getStatus());
			user1.setUserName(user.getUserName());
			userDao.update(user1);
		}
		
	}

	@Override
	public boolean loginUser(User user,HttpSession session) throws Exception {
		User user1=userDao.query(user.getLoginName(),user.getPassword());
		if(user1!=null)
		{
			session.setAttribute("user_session", user1);
			return true;
		}
		return false;
	}

	@Override
	public void queryUser(User user,Model mav) throws Exception {
		List<User> list=null;
		if(user.getUserName()==null&&user.getStatus()==0)
		{
			list = userDao.query();
		}
		if(user.getUserName()==null&&user.getStatus()!=0)
		{
			list=userDao.queryByStatus(user.getStatus());
		}
		if(user.getStatus()==0&&user.getUserName()!=null)
		{
			list=userDao.query(user.getUserName());
		}
		if(user.getStatus()!=0&&user.getUserName()!=null)
		{
			list=userDao.query(user.getUserName(),user.getStatus());
		}
		mav.addAttribute("users", list);
		
		
	}




	@Override
	public void delUser(String ids) throws Exception {
		String[] strs=ids.split(",");
		for(String id: strs)
		{
			User user=userDao.query(Integer.parseInt(id));
			userDao.delUser(user);
		}
	}

	@Override
	public User queryById(int id) throws Exception {
		return userDao.query(id);
	}

}
