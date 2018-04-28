package com.ywl.hr.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ywl.hr.pojo.User;
import com.ywl.hr.service.UserServiceI;
/**
 * �û��Ŀ��Ʋ�
 * @author ��
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceI userService;
	/**
	 * ɾ���û�
	 * @param ids
	 * @return
	 */
	@RequestMapping("/removeUser")
	public String delUser(String ids)
	{
		System.out.println("ok");
		try {
			userService.delUser(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:selectUser.action";
	}
	/**
	 * �޸��û�
	 * @param user
	 * @param flag
	 * @param model
	 * @return
	 */
	@RequestMapping("/updateUser")
	public String updateUser(User user ,String flag,Model model)
	{
		if("2".equals(flag))
		{
			try {
				userService.updateUser(user);
				return "redirect:selectUser.action";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			model.addAttribute("user", userService.queryById(user.getId()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "user/showUpdateUser";
	}
	/**
	 * �û���ע��
	 * @param user
	 * @return
	 */
	@RequestMapping("/regist")
	public String regist(User user)
	{
		try {
			user.setCreateDate(new Date());
			userService.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:selectUser.action";
	}
	/**
	 * �û��ĵ�¼
	 * @param user
	 * @param session
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView login(User user, HttpSession session)
	{
		ModelAndView mav=new ModelAndView();
		try {
			if(userService.loginUser(user,session))
			{
				mav.setViewName("toMain");
				return mav;
			}
		} catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("loginForm");
			return mav;
		}
		mav.setViewName("loginForm");
		return mav;
	}
	
	/**
	 * ��ת������û�����
	 * @return
	 */
	@RequestMapping("/addUser")
	public String toShowAddUser()
	{
		return "user/showAddUser";
	}
	/**
	 * ��ѯ�û�
	 * @param userName
	 * @param status
	 * @param mod
	 * @return
	 */
	@RequestMapping("/selectUser")
	public String toUser(String userName,String status,Model mod)
	{
		try {
			User user=new User();
			int sta=0;
			if("".equals(userName))
			{
				userName=null;
			}
			if(!"".equals(status)&&status!=null)
			{
				sta=Integer.parseInt(status);
			}
			user.setStatus(sta);
			user.setUserName(userName);
			System.out.println(user);
			userService.queryUser(user, mod);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "user/user";
	}
}
