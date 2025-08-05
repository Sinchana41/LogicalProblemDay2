package com.logicalproblems;

public class MissingNumberInAP {

	public static void main(String[] args) {
		int[] ar= {2,6,8,10,12,14};
		int missedNumber=missingNumberInAP(ar);
		System.out.println(missedNumber);
	}

	private static int missingNumberInAP(int[] ar) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int sum=0;
		
		
		for (int i = 0; i < ar.length; i++) {
			
			if(ar[i]<min) {
				min=ar[i];
			}
			if(ar[i]>max) {
				max=ar[i];
			}
			
			sum=sum+ar[i];
			
		}
		int n=ar.length+1;//if one numbwe is not missing
		int expectedSum=n*(max+min)/2;
		
		return expectedSum-sum;
	}
	
}
