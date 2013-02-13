public class QuickSortComparisons {

	private static long comparison_count = 0;

	public long getComparison_count() {
		return this.comparison_count;
	}

	public void sortAndCalculateComparisons(int[] input, int type) {

		switch (type) {
		// Case: select 1st element of array as pivot.
		case 1:
			comparison_count = 0;
			sortWithPivotFirst(input);
			break;

		// Case: select last element of array as pivot.
		case 2:
			comparison_count = 0;
			sortWithPivotLast(input);
			break;

		// Case: select median of 1st, middle and last elements as pivot
		case 3:
			comparison_count = 0;
			sortWithPivotMedian(input);
			break;
		}
	}

	private void sortWithPivotFirst() {

	}

	private void sortWithPivotLast() {

	}

	private void sortWithPivotMedian() {

	}

	// The function considers the pivot at the first position of the array.
	// Format Req: Do swap the first pos with your intended pivt while using
	// this function
	private void quickSort(int[] input, int left, int right) {
		int new_pivot_pos = partitionAtPivot(input, left, right);
	}

	private int partitionAtPivot(int[] input, int left, int right) {
		int pivot = input[left];

		return 1;
	}
}
