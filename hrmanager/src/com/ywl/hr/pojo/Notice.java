package com.ywl.hr.pojo;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable{

	private int id;//������
	private User user;//�ù���ķ�����
	private Date createDate;//����ʱ�� 
	private String title;//����
	private String content;//����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Notice(){}
}
