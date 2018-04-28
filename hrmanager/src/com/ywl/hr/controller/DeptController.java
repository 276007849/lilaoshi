package com.ywl.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ywl.hr.pojo.Dept;
import com.ywl.hr.service.DeptServiceI;

/**
 * ���ŵĿ��Ʋ�
 * @author ��
 *
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptServiceI deptService;
	/**
	 * ��ʾ�����б�
	 * @return
	 */
	@RequestMapping("/selectDept")
	public String showDept(Dept dept,Model model)
	{
	
		try {
			deptService.showDept(dept, model, "depts");
		} catch (Exception e) {
			e.printStackTrace();
			return "dept/dept";
		}
		return "dept/dept";
	}
	/**
	 * ��Ӳ���
	 * @return
	 */
	@RequestMapping("/addDept")
	public String addDept(Dept dept,String flag)
	{
		if("2".equals(flag))
		{
			try {
				deptService.addDept(dept);
				return "redirect:selectDept.action";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "dept/showAddDept";
	}
	/**
	 * �޸��û�
	 * @param dept
	 * @return
	 */
	@RequestMapping("updateDept")
	public String updateDept(Dept dept,Model model,String flag)
	{
		if("2".equals(flag))
		{
			try {
				deptService.updateDept(dept);
				return "redirect:selectDept.action";
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			model.addAttribute("dept", deptService.queryById(dept.getId()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "dept/showUpdateDept";
	}
	@RequestMapping("removeDept")
	public String delDept(String ids)
	{
		try {
			deptService.delDept(ids);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:selectDept.action";
	}
}
