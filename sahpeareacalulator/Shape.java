package com.oops.sahpeareacalulator;

public abstract class Shape {

	private String type;

	Shape(String type) {
		this.type = type;
	}

	abstract double getArea();

	public void printType() {
		System.out.println("Shape Type: " + type);
	}
}
