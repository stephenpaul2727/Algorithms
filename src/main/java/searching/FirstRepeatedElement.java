package searching;

/* Brute Force Implementation of finding first repeated Element in the array. 
Time Complexity is O(n*n) */
public class FirstRepeatedElement {

	private int firstRepeated(int[] arr, int len) {
		int i = 0, j = 0, counter = 0, maxelement = arr[0];
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					counter++;
				}
			}
			if (counter != 0) {
				maxelement = arr[i];
				break;
			}
		}
		return maxelement;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 2, 2, 3 };
		FirstRepeatedElement fre = new FirstRepeatedElement();
		System.out.println("The first repeated Element would be: " + fre.firstRepeated(arr, arr.length));
	}

}
