package com.ywl.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ywl.hr.pojo.Employee;
import com.ywl.hr.service.EmployeeServiceI;
/**
 * ְԱ���Ʋ�
 * @author ��
 *
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceI empService;
	/**
	 * ��ѯְԱ
	 * @return
	 */
	@RequestMapping("/selectEmployee")
	public String showEmp(Employee emp,Model model)
	{
		try {
			empService.showEmp(model, emp, "employees");
			empService.getDepts(model, "depts");
			empService.getJobs(model, "jobs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "employee/employee";
	}
	/**
	 * ���ְԱ
	 * @return
	 */
	@RequestMapping("/addEmployee")
	public String addEmp(Employee emp,String flag,Model model)
	{
		try
		{
			empService.getDepts(model, "depts1");
			empService.getJobs(model, "jobs1");
			if("2".equals(flag))
			{
				empService.addEmp(emp);
				return "redirect:selectEmployee.action";
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "employee/showAddEmployee";
	}
	/**
	 * �޸�ְԱ
	 * @param emp
	 * @param flag
	 * @param model
	 * @return
	 */
	@RequestMapping("/updateEmployee")
	public String updateEmp(Employee emp,String flag,Model model)
	{
		
		if("2".equals(flag))
		{
			try {
				empService.updateEmp(emp);
				return "redirect:selectEmployee.action";
			} catch (Exception e) {
				e.printStackTrace();
				return "redirect:selectEmployee.action";
			}
		}
		try {
			empService.getJobs(model, "jobs");
			empService.getDepts(model, "depts");
			model.addAttribute("employee", empService.queryById(emp.getId()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "employee/showUpdateEmployee";
	}
	/**
	 * ɾ��ְԱ
	 * @param ids
	 * @return
	 */
	@RequestMapping("/removeEmployee")
	public String delEmp(String ids)
	{
		try {
			empService.delEmp(ids);
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:selectEmployee.action";
		}
		return "redirect:selectEmployee.action";
	}
}
