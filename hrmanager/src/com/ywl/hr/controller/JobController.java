package com.ywl.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ywl.hr.pojo.Job;
import com.ywl.hr.service.JobServiceI;

@Controller
@RequestMapping("/job")
public class JobController {

	@Autowired
	private JobServiceI jobService;
	
	/**
	 * 显示职业
	 * @param job
	 * @param model
	 * @return
	 */
	@RequestMapping("/selectJob")
	public String showJob(Job job,Model model)
	{
		try {
			jobService.showJob(job, model, "jobs");
		} catch (Exception e) {
			e.printStackTrace();
			return "job/job";
		}
		return "job/job";
	}
	/**
	 * 添加部门
	 * @return
	 */
	@RequestMapping("/addJob")
	public String addJob(Job job,String flag)
	{
		if("2".equals(flag))
		{
			try {
				jobService.addJob(job);
				return "redirect:selectJob.action";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "job/showAddJob";
	}
	/**
	 * 修改用户
	 * @param Job
	 * @return
	 */
	@RequestMapping("updateJob")
	public String updateJob(Job job,Model model,String flag)
	{
		if("2".equals(flag))
		{
			try {
				jobService.updateJob(job);
				return "redirect:selectJob.action";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			model.addAttribute("job", jobService.queryById(job.getId()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "job/showUpdateJob";
	}
	@RequestMapping("removeJob")
	public String delJob(String ids)
	{
		try {
			jobService.delJob(ids);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:selectJob.action";
	}
}
