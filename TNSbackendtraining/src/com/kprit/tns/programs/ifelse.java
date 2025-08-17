package com.kprit.tns.programs;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		evenorodd ob=new evenorodd();
		ob.checkevenorodd(num);
	}

}
