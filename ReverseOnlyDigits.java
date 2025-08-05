package com.logicalproblems;

public class ReverseOnlyDigits {

	public static void main(String[] args) {
		String st="a1b2c3d";
		String rev=reverseOnlyDigits(st);
		System.out.println(rev);
	}

	private static String reverseOnlyDigits(String st) {
	
		char[] ch=st.toCharArray();
		int j=ch.length-1;
		
		for (int i = 0; i < ch.length; i++) {
			
			if(Character.isDigit(ch[i])) {
				
				while(!Character.isDigit(ch[j])) {
					j--;
				}
				ch[i]=st.charAt(j);
				j--;
			}
		}
		return new String(ch);
	}
}
