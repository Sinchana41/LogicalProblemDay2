package com.logicalproblems;

import java.util.Scanner;

public class NumberReversible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		System.out.println(isReversible(n));
	}

	private static boolean isReversible(int n) {
		int rev=0,temp=n;
		do {
		     int d=n%10;
		      rev=rev*10+d;
		     n=n/10;
		}while(n!=0);
		
		int sum=rev+temp;
		do {
		     int d=sum%10;
		      if(d%2==0) {
		    	  return false;
		      }
		     sum=sum/10;
		}while(sum!=0);
		
		return true;
	}
}
