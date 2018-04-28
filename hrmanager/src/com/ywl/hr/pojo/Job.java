package com.ywl.hr.pojo;

import java.io.Serializable;

/**
 * 职业
 * @author 龙
 *
 */
public class Job implements Serializable{

	private int id;//职业编号
	private String name;//职业名
	private String pemark;//备注
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
	
}
