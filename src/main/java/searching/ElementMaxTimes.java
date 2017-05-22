package searching;

/* Brute Force Implementation of Element which appears maximum times in an Array 
   Time Complexity is O(n*n) */
public class ElementMaxTimes {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 2, 2, 3, 3, 2 };
		int length = arr.length;
		ElementMaxTimes elementMaxTimes = new ElementMaxTimes();
		System.out.println("Max Repeated Element in the Array is: " + elementMaxTimes.maxRepeated(arr, length));
	}

	public int maxRepeated(int[] givenArray, int len) {
		int i = 0, j = 0, max = 0, counter, maxelement = givenArray[0];
		for (i = 0; i < len; i++) {
			counter = 0;
			for (j = i + 1; j < len; j++) {
				if (givenArray[i] == givenArray[j]) {
					counter++;
				}
			}
			if (counter > max) {
				max = counter;
				maxelement = givenArray[i];
			}
		}
		return maxelement;

	}
}
