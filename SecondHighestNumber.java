package com.logicalproblems;

import java.util.HashSet;
import java.util.Set;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5};
		int secondHighestNumber=secondHighestNumber(ar);
		System.out.println("Second Highest Number: "+secondHighestNumber);
	}

	private static int secondHighestNumber(int[] ar) {
		
		Set<Integer> hs=new HashSet<Integer>();
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MAX_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			if(hs.contains(ar[i]))
				continue;
			
			hs.add(ar[i]);
			
			if(ar[i]>max) {
				secondMax=max;
				max=ar[i];
			}else if(ar[i]>secondMax){
				secondMax=ar[i];
			}
		}
		return secondMax;
}
}