package com.oops.myarray;

public class MyArray {
	private	int[] data;
	private	int size;

	public MyArray() {
		data = new int[2]; // Initial capacity
		size = 0;
	}


	public void add(int element) {
		if (size == data.length) {
			resize(); 
		}
		data[size++] = element;
	}


	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Invalid index " + index);
		}
		return data[index];
	}


	public int size() {
		return size;
	}


	private void resize() {
		int newCapacity = data.length * 2;
		int[] newData = new int[newCapacity];

		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}

		data = newData;
	}

	public void printAll() {
		for (int i = 0; i < size; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
