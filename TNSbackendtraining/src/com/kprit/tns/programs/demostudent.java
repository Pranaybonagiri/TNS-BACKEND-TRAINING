package com.kprit.tns.programs;

public class demostudent {
	private int sid;
	private String sname;
	public int getsid() {
	return sid;}
	public void setsid(int sid) {
		this.sid=sid;		
	}
	public String getsname() {
		return sname;
	}
	public void setsname(String sname) {
		this.sname=sname;
	}
	public void display() {
		System.out.println("the student details are:"+sid+sname);
	}
}
