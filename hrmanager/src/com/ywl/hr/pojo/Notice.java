package com.ywl.hr.pojo;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable{

	private int id;//公告编号
	private User user;//该公告的发布者
	private Date createDate;//发布时间 
	private String title;//标题
	private String content;//内容
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
