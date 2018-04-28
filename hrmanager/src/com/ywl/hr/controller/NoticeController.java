package com.ywl.hr.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ywl.hr.pojo.Notice;
import com.ywl.hr.pojo.User;
import com.ywl.hr.service.NoticeServiceI;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	private NoticeServiceI noticeService;
	@RequestMapping("/selectNotice")
	public String showNotice(Notice notice,Model model)
	{
		try {
			noticeService.showNotice(notice, model, "notices");
		} catch (Exception e) {
			e.printStackTrace();
			return "notice/notice";
		}
		return "notice/notice";
	}
	@RequestMapping("/addNotice")
	public String addNotice(Notice notice ,HttpSession session,String flag)
	{
		if("2".equals(flag))
		{
			User user=(User) session.getAttribute("user_session");
			System.out.println(user);
			System.out.println(user.getId());
			notice.setUser(user);
			try {
				noticeService.addNotice(notice);
				return "redirect:selectNotice.action";
			} catch (Exception e) {
				e.printStackTrace();
				return "redirect:selectNotice.action";
			}
		}
		return "notice/showAddNotice";
	}
	@RequestMapping("/updateNotice")
	public String updateNotice(Notice notice,HttpSession session,Model model,String flag)
	{
		if("2".equals(flag))
		{
			User user=(User) session.getAttribute("user_session");
			notice.setUser(user);
			try {
				noticeService.updateNotice(notice);
				return "redirect:selectNotice.action";
			} catch (Exception e) {
				e.printStackTrace();
				return "redirect:selectNotice.action";
			}
		}
		try {
			model.addAttribute("notice", noticeService.queryById(notice.getId()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "notice/showUpdateNotice";
	}
	@RequestMapping("/removeNotice")
	public String delNotice(String ids) 
	{
		try {
			noticeService.delNotice(ids);
			
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:selectNotice.action";
		}
		return "redirect:selectNotice.action";
		
	}
	@RequestMapping("/previewNotice")
	public String preNotice(Notice notice,Model model)
	{
		try {
			model.addAttribute("notice", noticeService.queryById(notice.getId()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "notice/previewNotice";
	}
}
