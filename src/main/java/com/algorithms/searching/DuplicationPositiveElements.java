package com.algorithms.searching;

import java.lang.Math;

/* Negation Technique to verify if duplicate exists in an array
 * Time Complexity : O(n)
 */
public class DuplicationPositiveElements {

	private void findDuplicateInPositiveElements(int[] arr, int len) {
		int i = 0;
		for (i = 0; i < len; i++) {
			if (arr[Math.abs(arr[i])] < 0) {
				System.out.println("Duplicate Element found at position " + i);
				System.exit(1);
			} else {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			}
		}
		System.out.println("No duplicate Elements Founds!");
	}

	public static void main(String[] args) {
		int[] givenarray = { 3, 2, 1, 2, 2, 3, 4, 4 };
		DuplicationPositiveElements dpe = new DuplicationPositiveElements();
		dpe.findDuplicateInPositiveElements(givenarray, givenarray.length);
	}
}
