package com.ywl.hr.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ywl.hr.pojo.User;

@Controller
public class MainController {

	@RequestMapping("main")
	public String toMain()
	{
		return "main";
	}
	@RequestMapping("login")
	public String toLogin()
	{
		return "loginForm";
	}
	@RequestMapping("top")
	public String toTop()
	{
		return "top";
	}
	@RequestMapping("left")
	public String toLeft()
	{
		return "left";
	}
	@RequestMapping("right")
	public String toRight()
	{
		return "right";
	}
	@RequestMapping("logout")
	public String exitUser(HttpSession session,Model model)
	{
		User user=(User) session.getAttribute("user_session");
		model.addAttribute("loginName", user.getLoginName());
		model.addAttribute("password", user.getPassword());
		session.removeAttribute("user_session");
		return "loginForm";
	}
}
