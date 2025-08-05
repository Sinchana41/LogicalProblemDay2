package com.oops.myarray;

import java.util.Arrays;

public class MainArray {

	public static void main(String[] args) {
		MyArray array = new MyArray();

		array.add(10);
		array.add(20);
		array.add(30); 

		array.printAll();
		System.out.println("Element at index 1: " + array.get(1)); 
		System.out.println("Size: " + array.size()); 
	}
}
