package com.logicalproblems;

import java.util.stream.IntStream;

public class PrintNumbersWithoutLoops {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100)
		         .forEach(System.out::println);
	}
}