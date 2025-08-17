package com.kprit.tns.programs;

public class constructoroverloading {

	public static void main(String[] args) {
		student2 obj=new student2();
		student2 obj1=new student2("ankitha",19);
		System.out.println(obj.name+ "is"+obj.age);
		System.out.println(obj1.name+ "is"+obj1.age);
		}

}
