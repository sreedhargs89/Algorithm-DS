package com.sree.sortAlgo;

public class InsertionSort {

	/**
	 * Insertion sort, select an element and insert it if this number is more than element at that position
	 * move that element to ith position, vise versa for the descending order
	 * @param input : input array of integer elements
	 * @return returns sorted array of elements
	 */
	public static int[] sort(int[] input) {

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					int temp = input[j];
					input[j] = input[i];
					input[i] = temp;
				}
			}
		}
		return input;
	}

	/**
	 * Testing method
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int input[] = { 12, 8, 7, 5, 2, 3, -7, 1, 0 };
		int output[] = sort(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
