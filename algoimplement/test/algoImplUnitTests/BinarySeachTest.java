/**
 * 
 */
package algoImplUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sree.searchAlgo.BinarySearch;

/**
 * @author Sreedhara GS
 *
 * Happy Learning :)
 * 
 * jUnit test class for binary search
 * 1. Pass condition
 * 2. Element not found in the array condition
 * 3. Binary search fail : Expected result is different from the Actual
 */

public class BinarySeachTest {

	int[] input = {1, 2, 4, 6, 9, 22, 33, 45, 50, 61,70};
	
	@Test
	public void binarySearchTest() {
		int key = 45;
		int expected = 7;
		int actual = BinarySearch.binarySearch(input, key);
		assertEquals(expected, actual);
	}
	
	@Test
	public void binarySearchTest2() {
		int key = 41;
		int expected = -1;
		int actual = BinarySearch.binarySearch(input, key);
		assertEquals(expected, actual);
	}
	
	@Test
	public void binarySearchFailTest() {
		int key = 41;
		int expected = 7;
		int actual = BinarySearch.binarySearch(input, key);
		assertNotEquals(expected, actual);
	}	

}
