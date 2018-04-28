package com.ywl.hr.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 职员
 * @author 龙
 *
 */
public class Employee implements Serializable{

	
	private int id;//员工号
	private Dept dept;//所属部门
	private Job job;//职业
	private String dept_id;//部门id
	private String job_id;//职业id
	private String name;//姓名
	private String cardId;//卡号
	private String address;//地址
	private String postCode;//提交码
	private String tel;//座机号
	private String phone;//手机号
	private String qqNum;//qq号
	private String email;//email地址
	private int sex;//性别，1男，0女，2，other
	private String sex1;
	private String party;//党派
	private String birthday;//生日日期
	private String race;//民族
	private String education;//学历
	private String speciality;//特长
	private String pemark;//备注
	private Date createDate;//记录创建时间
	private String hobby;//爱好
	

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
