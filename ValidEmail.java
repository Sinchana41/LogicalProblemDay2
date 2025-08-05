package com.logicalproblems;

public class ValidEmail {

	public static void main(String[] args) {
		String email1 = "test@gmail.com";
		String email2 = "invalid@com";
		System.out.println(email1 + " → " + isValidEmail(email1));  // true
		System.out.println(email2 + " → " + isValidEmail(email2));  // false
	}

	public static boolean isValidEmail(String email) {

		int atIndex = email.indexOf('@');
		int lastAtIndex = email.lastIndexOf('@');
		if (atIndex <= 0 || atIndex != lastAtIndex) {
			return false; 
		}


		String beforeAt = email.substring(0, atIndex);
		String afterAt = email.substring(atIndex + 1);
		if (beforeAt.length() == 0 || afterAt.length() == 0) {
			return false;
		}


		int dotIndex = afterAt.indexOf('.');
		if (dotIndex <= 0 || dotIndex == afterAt.length() - 1) {
			return false;
		}

		return true;
	}
}


