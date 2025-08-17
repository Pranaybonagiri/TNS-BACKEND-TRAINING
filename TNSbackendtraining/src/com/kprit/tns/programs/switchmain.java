package com.kprit.tns.programs;
import java.util.Scanner;
public class switchmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		switch(num%2) {
		case 0:{
			System.out.println(num+"is even number");
		}
		case 1:{
			System.out.println(num+"is odd number");
		}
		}
		

	}

}
