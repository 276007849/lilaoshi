package com.ywl.hr.pojo;

import java.io.Serializable;

/**
 * ����ʵ��
 * @author ��
 *
 */
public class Dept implements Serializable{

	private int id;//���ű��
	private String name;//������
	private String pemark;//����
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
