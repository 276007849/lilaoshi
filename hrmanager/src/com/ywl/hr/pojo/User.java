package com.ywl.hr.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * �û�ʵ��
 * @author ��
 *
 */
public class User implements Serializable{

	private int id;//���
	private String loginName;//��¼��
	private String password;//����
	private int status;//1����״̬Ϊ���0����δ����
	private Date createDate;//����ʱ��
	private String userName;//�û���
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
