package com.ywl.hr.pojo;

import java.io.Serializable;

/**
 * ְҵ
 * @author ��
 *
 */
public class Job implements Serializable{

	private int id;//ְҵ���
	private String name;//ְҵ��
	private String pemark;//��ע
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
