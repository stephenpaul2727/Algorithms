package searching;

import sorting.QuickSort;

public class ElementMaxTimesWithSort {

private int maxRepeatedSort(int[] arr, int len){
	int i = 0,max = 0,counter = 0,maxelement = arr[0];
	QuickSort quickSort = new QuickSort();
	int[] sortArray = quickSort.quick(arr);
	for(i=0;i<len-1;i++){
		if(sortArray[i] == sortArray[i+1]){
			counter++;
			if(max<counter){
				max = counter;
				maxelement = sortArray[i];
			}
		}
		else{
			counter = 0;
		}
	}
	return maxelement;
}

public static void main(String[] args){
	ElementMaxTimesWithSort emtws = new ElementMaxTimesWithSort();
	int[] arr = {3,2,1,2,2,3};
	int result = emtws.maxRepeatedSort(arr, arr.length);
	System.out.println("The maximum repeated element is "+result);
}
}
