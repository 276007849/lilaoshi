package com.ywl.hr.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * ְԱ
 * @author ��
 *
 */
public class Employee implements Serializable{

	
	private int id;//Ա����
	private Dept dept;//��������
	private Job job;//ְҵ
	private String dept_id;//����id
	private String job_id;//ְҵid
	private String name;//����
	private String cardId;//����
	private String address;//��ַ
	private String postCode;//�ύ��
	private String tel;//������
	private String phone;//�ֻ���
	private String qqNum;//qq��
	private String email;//email��ַ
	private int sex;//�Ա�1�У�0Ů��2��other
	private String sex1;
	private String party;//����
	private String birthday;//��������
	private String race;//����
	private String education;//ѧ��
	private String speciality;//�س�
	private String pemark;//��ע
	private Date createDate;//��¼����ʱ��
	private String hobby;//����
	

	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQqNum() {
		return qqNum;
	}
	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
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
	
	public String getSex1() {
		return sex1;
	}
	public void setSex1(String sex1) {
		this.sex1 = sex1;
	}
	public Employee(){}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + ", job=" + job + ", dept_id=" + dept_id + ", job_id=" + job_id
				+ ", name=" + name + ", cardId=" + cardId + ", address=" + address + ", postCode=" + postCode + ", tel="
				+ tel + ", phone=" + phone + ", qqNum=" + qqNum + ", email=" + email + ", sex=" + sex + ", sex1=" + sex1
				+ ", party=" + party + ", birthday=" + birthday + ", race=" + race + ", education=" + education
				+ ", speciality=" + speciality + ", pemark=" + pemark + ", createDate=" + createDate + ", hobby="
				+ hobby + "]";
	}
}
