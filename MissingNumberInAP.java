package com.logicalproblems;

public class MissingNumberInAP {

	public static void main(String[] args) {
		int[] array= {2,6,8,10,12,14};
		int missedNumber=missingNumberInAP(array);
		System.out.println(missedNumber);
	}

	private static int missingNumberInAP(int[] array) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int sum=0;


		for (int i = 0; i < array.length; i++) {

			if(array[i]<min) {
				min=array[i];
			}
			if(array[i]>max) {
				max=array[i];
			}

			sum=sum+array[i];

		}
		int n=array.length+1;//if one number is not missing
		int expectedSum=n*(max+min)/2;

		return expectedSum-sum;
	}

}
