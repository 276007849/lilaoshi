package com.ywl.hr.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.ywl.hr.dao.DeptDaoI;
import com.ywl.hr.pojo.Dept;
import com.ywl.hr.service.DeptServiceI;

/**
 * 用户业务逻辑层
 * @author 龙
 *
 */
@Service
@Transactional
public class DeptService implements DeptServiceI{

	@Autowired
	private DeptDaoI deptDao;

	@Override
	public void addDept(Dept dept) throws Exception {
		if("".equals(dept.getName()))
		{
			new RuntimeException("数据异常");
		}
		deptDao.addDept(dept);
		
	}

	@Override
	public void delDept(String ids) throws Exception {
		String[] strs=ids.split(",");
		for(String id:strs)
		{
			Dept dept1=deptDao.queryById(Integer.parseInt(id));
			if(dept1!=null)
			{
				deptDao.delDept(dept1);
			}
		}
		
	}

	@Override
	public void updateDept(Dept dept) throws Exception {
			deptDao.updateDept(dept);
	}

	@Override
	public void showDept(Dept dept, Model model,String name) throws Exception {
		if("".equals(dept.getName())||dept.getName()==null)
		{
			List<Dept> list = deptDao.queryDept();
			model.addAttribute(name ,list);
		}
		else
		{
			List<Dept> list = deptDao.queryDept(dept.getName());
			model.addAttribute(name ,list);
		}
			
		
	}

	@Override
	public Dept queryById(int id) throws Exception {
		return deptDao.queryById(id);
	}

	
}
