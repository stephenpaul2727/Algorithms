package com.algorithms.searching;

import com.algorithms.sorting.QuickSort;

/*
 * Implementation of finding the missing number in an array of n-1 integers which are in range of 1 to n
 * NO DUPLICATIONS
 */
public class MissingNumber {

	public void findMissingNumber(int[] arr) {
		QuickSort quickSort = new QuickSort();
		int[] resarr = quickSort.quick(arr);
		int counter = 0;
		//resarr.length is equal to largest element in the array.
		for(int j=1;j<=resarr.length;j++){
			if(resarr[counter]==j){
				counter++;
			}
			else{
				System.out.println("Missing Number is: "+j);
				System.exit(1);
			}
		}
		System.out.println("No Missing Elements Found");
	}
	
	public static void main(String[] args){
		int[] givenArray = {1,2,5,6,3,7,8,9,12,4,10};
		MissingNumber missingNumber = new MissingNumber();
		missingNumber.findMissingNumber(givenArray);
	}
}
