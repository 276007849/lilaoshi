package com.ywl.hr.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体
 * @author 龙
 *
 */
public class User implements Serializable{

	private int id;//编号
	private String loginName;//登录名
	private String password;//密码
	private int status;//1代表状态为激活，0代表未激活
	private Date createDate;//创建时间
	private String userName;//用户名
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public User() {
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", loginName=" + loginName + ", password=" + password + ", status=" + status
				+ ", createDate=" + createDate + ", userName=" + userName + "]";
	}
	
}
