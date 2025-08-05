package com.oops.myarray;

import java.util.Arrays;

public class MainArray {

	 public static void main(String[] args) {
	        MyArray arr = new MyArray();

	        arr.add(10);
	        arr.add(20);
	        arr.add(30); 

	        arr.printAll();
	        System.out.println("Element at index 1: " + arr.get(1)); 
	        System.out.println("Size: " + arr.size()); 
	    }
}
