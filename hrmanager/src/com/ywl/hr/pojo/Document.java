package com.ywl.hr.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * �ĵ�
 * @author ��
 *
 */
public class Document implements Serializable{

	private int id;//�ĵ����
	private String title ;//����
	private String fileName;//�ļ���
	private String pemark;//��ע
	private Date createDate;//��������
	private User user;//�û�
	public Document(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getPemark() {
		return pemark;
	}
	public void setPemark(String pemark) {
		this.pemark = pemark;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", title=" + title + ", fileName=" + fileName + ", pemark=" + pemark
				+ ", createDate=" + createDate + ", user=" + user + "]";
	}
	
}
