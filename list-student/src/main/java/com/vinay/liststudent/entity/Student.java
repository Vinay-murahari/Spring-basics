package com.vinay.liststudent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@Column(name="student_id")
	public int sid;
	@Column(name="student_fname")
	public String sfirst_name;
	@Column(name="student_lname")
	public String slast_name;
	@Column(name="student_adress")
	public String sadress;
//	@Column(name="Student_dob")
//	public Date sdob;
//	
//	
//	public Date getSdob() {
//		return sdob;
//	}
//	public void setSdob(Date sdob) {
//		this.sdob = sdob;
//	}
	
	public Student() {	
	}
	
	public Student(int sid, String sfirst_name, String slast_name, String sadress) {
	this.sid = sid;
	this.sfirst_name = sfirst_name;
	this.slast_name = slast_name;
	this.sadress = sadress;
	}

	public String getSadress() {
		return sadress;
	}
	public void setSadress(String sadress) {
		this.sadress = sadress;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSfirst_name() {
		return sfirst_name;
	}
	public void setSfirst_name(String sfirst_name) {
		this.sfirst_name = sfirst_name;
	}
	public String getSlast_name() {
		return slast_name;
	}
	public void setSlast_name(String slast_name) {
		this.slast_name = slast_name;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sfirst_name=" + sfirst_name + ", slast_name=" + slast_name + "]";
	}
	
	

}
