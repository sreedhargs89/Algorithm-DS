package com.sree.searchAlgo;

/**
 * @author Sreedhara GS
 *
 * Happy Learning :)
 */

public class BinarySearch {
	
	/**
	 * This method returns the index search element
	 * @param inputArr Input array
	 * @param key Element needs to be search
	 * @return index of the element, -1 if element is not found
	 * 
	 * Description:
	 * 1. Method takes the input array and key to be searched.
	 * 2. Best case : key == mid
	 * 3. Worst case: Element not found
	 * 4. If element is less than middle element : consider left array i.e low to mid -1
	 * 5. If element is more than middle element: consider right array i.e mid+1 to high
	 * 6. Always mid will be changed along with low or high
	 * 7. Matching will return mid at that stage
	 * 8. No match will return -1
	 */
	
	public static int binarySearch(int inputArr[], int key){
		int low =0;
		int high = inputArr.length -1;

		while(low <= high){
			int mid = low + (high -low)/2;
			if (key == inputArr[mid])  {
				return mid;
			}else if (key < inputArr[mid]){
				high = mid -1;
			}else if (key > inputArr[mid]) {
				low = mid +1;
			}				
		}
		return -1;
	}
}
