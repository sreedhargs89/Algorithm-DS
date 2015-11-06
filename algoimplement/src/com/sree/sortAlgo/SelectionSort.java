package com.sree.sortAlgo;

public class SelectionSort {

	/**
	 * Selection sort algorithm, basic idea is to consider first as the min and compare to rest of array
	 * elements and go till the end of the array and replace current min with actual min value
	 * @param input : takes the input array
	 * @return : returns the sorted output
	 * 
	 */
	public static int[] sort(int[] input) {

		for (int i = 0; i < input.length-2; i++) {
			int min = i;

			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[min])
					min = j;
			}
			
			int tmp = input[min];
			input[min] = input[i];
			input[i] = tmp;
		}

		return input;
	}

	/**
	 * Testing method
	 * @param args
	 */
	public static void main(String[] args) {
		int input[] = { 12, 8, 7, 5, 2, 3, -7 };
		int output[] = sort(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
