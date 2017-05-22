package sorting;

/* Implementation of the quick sort algorithm */
public class QuickSort {
	private int[] givenArray;
	private int length;

	/* Initializing the values of the array */
	public int[] quick(int[] values) {
		if (values == null || values.length <= 0) {
			return null;
		}
		this.length = values.length;
		this.givenArray = values;
		quick(0, length - 1);
		// Elements after Sorting
		return givenArray;
	}

	/* Quick Sort Algorithm */
	private void quick(int low, int high) {
		int i = low, j = high;
		int pivot = givenArray[low];
		while (i <= j) {
			while (givenArray[i] < pivot) {
				i++;
			}
			while (givenArray[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			quick(low, j);
		}
		if (high > i) {
			quick(i, high);
		}
	}

	/* Swapping two numbers in the given array */
	private void swap(int i, int j) {
		int temp = givenArray[i];
		givenArray[i] = givenArray[j];
		givenArray[j] = temp;
	}

	/* Main Function */
	public static void main(String[] args) {
		int[] arr = { 10, 2, 1, 9, 7, 22, 16, 8, 11, 2 };
		QuickSort quickSort = new QuickSort();
		quickSort.quick(arr);
	}
}
