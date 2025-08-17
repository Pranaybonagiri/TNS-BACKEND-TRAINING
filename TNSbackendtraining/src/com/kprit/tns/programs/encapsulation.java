package com.kprit.tns.programs;

public class encapsulation {

	public static void main(String[] args) {
		demostudent ob=new demostudent();
		ob.setsid(10);
		ob.setsname("hii");
		System.out.println(ob.getsid());
		System.out.println(ob.getsname());
	}

}
