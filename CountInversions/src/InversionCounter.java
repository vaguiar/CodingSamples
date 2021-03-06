public class InversionCounter {

	// Globally just store just one count variable.
	private static long inversionCount = 0;

	// Getter for the "inversionCount"
	public long getInversionCount() {
		return inversionCount;
	}

	// Divide step of the Fast Divide-Conquer Algo
	public void CountInversionAndSort(int[] input, int left_index,
			int right_index) {

		int middle_index = (left_index + right_index) / 2;

		if (middle_index < right_index) {
			CountInversionAndSort(input, left_index, middle_index);
			CountInversionAndSort(input, middle_index + 1, right_index);
			MergeAndCount(input, left_index, middle_index, right_index);
		}
	}

	// Conquer step for the Fast Divide-Conquer Algo
	public void MergeAndCount(int[] input, int left, int middle, int right) {

		// Temp arrays to hold the intermediate unsorted values.
		// final sorted values are placed in the org input array itself.
		int[] temp_arr1 = new int[(middle + 1 - left) + 1];
		int[] temp_arr2 = new int[(right - middle) + 1];

		for (int i = 0; i < temp_arr1.length - 1; i++) {
			temp_arr1[i] = input[left + i];
		}

		for (int i = 0; i < temp_arr2.length - 1; i++) {
			temp_arr2[i] = input[middle + 1 + i];
		}

		// Setting sentinel values to mark endpoints of both temp arrays.
		temp_arr1[temp_arr1.length - 1] = Integer.MAX_VALUE;
		temp_arr2[temp_arr2.length - 1] = Integer.MAX_VALUE;

		// Merge and count step
		int i = 0;
		int j = 0;

		for (int k = left; k < right + 1; k++) {
			if (temp_arr1[i] <= temp_arr2[j]) {
				input[k] = temp_arr1[i];
				i++;
			} else {
				input[k] = temp_arr2[j];
				inversionCount = inversionCount + temp_arr1.length - i - 1;
				j++;
			}
		}
	}
}
