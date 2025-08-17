package com.kprit.tns.programs;

public class parameterisedconstructor {

	public static void main(String[] args) {
		student1 ob1=new student1("pranay",20);
		student1 ob2=new student1("pranni",21);
		System.out.println(ob1.name+"is"+ob1.age);
		System.out.println(ob2.name+"is"+ob2.age);
	}

}
