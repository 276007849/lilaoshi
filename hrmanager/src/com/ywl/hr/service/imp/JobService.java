package com.ywl.hr.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.ywl.hr.dao.JobDaoI;
import com.ywl.hr.pojo.Job;
import com.ywl.hr.service.JobServiceI;
@Transactional
@Service
public class JobService implements JobServiceI{

	@Autowired
	private JobDaoI jobDao;

	@Override
	public void updateJob(Job job) throws Exception{
		jobDao.updateJob(job);
		
	}

	@Override
	public void addJob(Job job) throws Exception{
		if("".equals(job.getName())||job==null)
		{
			throw new RuntimeException("Êý¾ÝÒì³£");
		}
		jobDao.addJob(job);
		
	}

	@Override
	public void showJob(Job job, Model model, String string) throws Exception{
		if("".equals(job.getName())||job.getName()==null)
		{
			List<Job> jobs=jobDao.query();
			model.addAttribute(string, jobs);
		}
		else
		{
			List<Job> jobs=jobDao.query(job.getName());
			model.addAttribute(string, jobs);
		}
		
	}

	@Override
	public void delJob(String ids) throws Exception {
		String[] strs=ids.split(",");
		for(String id:strs)
		{
			Job job=jobDao.queryById(Integer.parseInt(id));
			jobDao.delJob(job);
		}
		
	}

	@Override
	public Job queryById(int id) throws Exception {
		return jobDao.queryById(id);
	}

}
