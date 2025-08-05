package com.logicalproblems;

public class RepeatingPattern {

	public static void main(String[] args) {
		String string="abcabcabc";
		String repeatedPattern=findRepeatingPattern(string);
		System.out.println(repeatedPattern);
	}

	private static String findRepeatingPattern(String st) {
		String s=st+st;
		int index=s.indexOf(st, 1);

		return st.substring(0, index);
	}
}
