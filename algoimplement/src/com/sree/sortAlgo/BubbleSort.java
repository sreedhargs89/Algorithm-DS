package com.sree.sortAlgo;

public class BubbleSort {

	/**
	 * Bubble sort algorithm, basic idea is to swap as and when you compare something to bubble out small/big till the end
	 * @param input : takes the input array
	 * @return : returns the sorted output
	 * 
	 */
	private static int[] sort(int[] input) {

		for (int i = 0; i < input.length-1; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i] > input[j]){
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
	 * @param args
	 */
	
	public static void main(String[] args) {
		int input[] = { 12, 8, 7, 5, 2, 3, -7 ,1,0};
		int output[] = sort(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}