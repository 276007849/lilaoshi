package com.ywl.hr.service.imp;

import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.ywl.hr.dao.DeptDaoI;
import com.ywl.hr.dao.EmployeeDaoI;
import com.ywl.hr.dao.JobDaoI;
import com.ywl.hr.pojo.Dept;
import com.ywl.hr.pojo.Employee;
import com.ywl.hr.pojo.Job;
import com.ywl.hr.service.EmployeeServiceI;
@Transactional
@Service
public class EmployeeService implements EmployeeServiceI{

	@Autowired
	private EmployeeDaoI empDao;
	@Autowired
	private DeptDaoI deptDao;
	@Autowired
	private JobDaoI jobDao;
	@Override
	public void getDepts(Model model,String name) throws Exception {
		List<Dept> list = deptDao.queryDept();
		System.out.println(list);
		model.addAttribute(name,list);
		
	}
	public String getHql(Employee emp)
	{
		String hql="select e from Employee e where ";
		if(emp.getSex()!=0)
		{
			hql=hql+" e.sex="+emp.getSex()+" and ";
		}
		if(emp.getDept()!=null)
		{
			hql=hql+" e.dept.id="+emp.getDept().getId()+" and ";
		}
		if(!"".equals(emp.getPhone())&&emp.getPhone()!=null)
		{
			hql=hql+" e.phone like '%"+emp.getPhone()+"%' and ";
		}
		if(!"".equals(emp.getName())&&emp.getName()!=null)
		{
			hql=hql+" e.name like '%"+emp.getName()+"%' and ";
		}
		if(emp.getJob()!=null)
		{
			hql=hql+" e.job.id="+emp.getJob().getId()+" and ";
		}
		if(!"".equals(emp.getCardId())&&emp.getCardId()!=null)
		{
			hql=hql+" e.cardId like '%"+emp.getCardId()+"%' and ";
		}
		if(!"select e from Employee e where ".equals(hql))
		{
			hql=hql.substring(0, hql.length()-4);
		}
		else
		{
			hql=null;
		}
		System.out.println(hql);
		return hql;
	}

	@Override
	public void getJobs(Model model,String name) throws Exception {
		List<Job> list = jobDao.query();
		System.out.println(list);
		model.addAttribute(name,list);
		
	}

	@Override
	public void showEmp(Model model, Employee emp,String name) throws Exception {
		if(!"0".equals(emp.getDept_id())&&emp.getDept_id()!=null)
		{
			Dept dept = deptDao.queryById(Integer.parseInt(emp.getDept_id()));
			emp.setDept(dept);
		}
		if(!"0".equals(emp.getJob_id())&&emp.getJob_id()!=null)
		{
			Job job = jobDao.queryById(Integer.parseInt(emp.getJob_id()));
			emp.setJob(job);
		}
		if(!"0".equals(emp.getSex1())&&emp.getSex1()!=null)
		{
			emp.setSex(Integer.parseInt(emp.getSex1()));
		}
		String hql=getHql(emp);
		if(hql==null)
		{
			List<Employee> list = empDao.query();
			model.addAttribute(name, list);
		}
		else
		{
			List<Employee> list = empDao.queryByHql(hql);
			model.addAttribute(name, list);
		}
		
		
	}

	@Override
	public void updateEmp(Employee emp) throws Exception {
		if(!"0".equals(emp.getDept_id()))
		{
			Dept dept = deptDao.queryById(Integer.parseInt(emp.getDept_id()));
			emp.setDept(dept);
		}
		if(!"0".equals(emp.getJob_id()))
		{
			Job job = jobDao.queryById(Integer.parseInt(emp.getJob_id()));
			emp.setJob(job);
		}
		if(!"0".equals(emp.getSex1()))
		{
			emp.setSex(Integer.parseInt(emp.getSex1()));
		}
		empDao.updateEmp(emp);
	}

	@Override
	public void delEmp(String ids) throws Exception {
		String[] strs=ids.split(",");
		for(String id:strs)
		{
			Employee emp = empDao.queryById(Integer.parseInt(id));
			empDao.delEmp(emp);
		}
		
	}
	@Override
	public void addEmp(Employee emp) throws Exception {
		if(!"0".equals(emp.getDept_id()))
		{
			Dept dept = deptDao.queryById(Integer.parseInt(emp.getDept_id()));
			emp.setDept(dept);
		}
		if(!"0".equals(emp.getJob_id()))
		{
			Job job = jobDao.queryById(Integer.parseInt(emp.getJob_id()));
			emp.setJob(job);
		}
		if(!"0".equals(emp.getSex1()))
		{
			emp.setSex(Integer.parseInt(emp.getSex1()));
		}
		emp.setCreateDate(new Date());
		empDao.addEmp(emp);
		
	}
	@Override
	public Employee queryById(int id) throws Exception {
		return empDao.queryById(id);
	}

}
