package com.algorithms.searching;

/*
 * Implemetation of finding Missing Number without Sorting the array
 * Time Complexity: O(n)
 */
public class MissingNumberWithoutSorting {

	public void findMissingNumber(int[] arr) {
		int l = arr.length;
		int sum = l*(l+1);
		sum = sum/2;
		for(int i=0;i<arr.length;i++){
			sum = sum-arr[i];
		}
		if(sum <= 0){
			System.out.println("No Missing Elements Found");
		}
		else{
			System.out.println("Missing Number is: "+sum);
		}
	}
	
	public static void main(String[] args){
		int[] givenArray = {1,2,5,6,3,7,8,9,12,4,10};
		MissingNumber missingNumber = new MissingNumber();
		missingNumber.findMissingNumber(givenArray);
	}
}
