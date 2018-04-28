package com.ywl.hr.pojo;

import java.io.Serializable;

/**
 * 部门实体
 * @author 龙
 *
 */
public class Dept implements Serializable{

	private int id;//部门编号
	private String name;//部门名
	private String pemark;//描述
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPemark() {
		return pemark;
	}
	public void setPemark(String pemark) {
		this.pemark = pemark;
	}
	public Dept(){}
}
