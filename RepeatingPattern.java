package com.logicalproblems;

public class RepeatingPattern {

	public static void main(String[] args) {
		String st="abcabcabc";
		String rp=findRepeatingPattern(st);
		System.out.println(rp);
	}

	private static String findRepeatingPattern(String st) {
		String s=st+st;
		int index=s.indexOf(st, 1);
		
		return st.substring(0, index);
	}
}
