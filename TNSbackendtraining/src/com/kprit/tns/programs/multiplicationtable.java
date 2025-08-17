package com.kprit.tns.programs;
import java.util.Scanner;
public class multiplicationtable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int res=0;
		for(int i=1;i<=10;i++) {
			res=num*i;
		System.out.println(num+"x"+i+"="+res);
		}
		}
		
	}
