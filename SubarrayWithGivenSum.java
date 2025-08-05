package com.logicalproblems;

import java.util.Arrays;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 7, 5};
		int target = 12;

		int[] result = findSubarray(arr, target);

		System.out.println(Arrays.toString(result));
	}

	public static int[] findSubarray(int[] arr, int target) {
		for (int start = 0; start < arr.length; start++) {
			int sum = 0;
			for (int end = start; end < arr.length; end++) {
				sum += arr[end];

				if (sum == target) {

					int length = end - start + 1;
					int[] subarray = new int[length];
					for (int i = 0; i < length; i++) {
						subarray[i] = arr[start + i];
					}
					return subarray;
				} 
			}
		}


		return null;
	}
}

