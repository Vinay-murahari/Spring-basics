package com.vinay.programmer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Programmer {
	@Id
	private int pid;
	private String pname;
	private String favlang;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getFavlang() {
		return favlang;
	}
	public void setFavlang(String favlang) {
		this.favlang = favlang;
	}
	@Override
	public String toString() {
		return "Programmer [pid=" + pid + ", pname=" + pname + ", favlang=" + favlang + "]";
	}
	 

}
