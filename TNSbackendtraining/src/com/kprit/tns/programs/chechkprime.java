package com.kprit.tns.programs;
import java.util.Scanner;
public class chechkprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		if(num<=1) {
			System.out.println(num+"is not a prime number");
		}
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				System.out.println(num+"is not a prime number");
			}
		System.out.println(num+ "is a prime number");
		break;
		}
		

	}

}
