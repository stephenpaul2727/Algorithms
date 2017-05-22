package sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.sorting.QuickSort;

public class QuickSortSpec {
	
	int[] arr = {5,4,3,2,1};
	QuickSort quickSort;

	@Before
	public void setUp() {
		quickSort = new QuickSort();
	}
	@Test
	public void test() {
		int[] result = quickSort.quick(arr);
		assertArrayEquals(result,new int[]{1,2,3,4,5});
	}

}
