package recursion;

public class checkSortedArray {
	public static void main(String[] args) {
		System.out.println("Check if the array is sorted or not!!!");
		int[] arr = {1, 2, 3, 45, 4};
		System.out.println(checkIfArrayIsSortedOrNot(arr, arr.length));
	}

	public static int checkIfArrayIsSortedOrNot(int[] arr, int index) {
		if (index <= 1) return 1;
		// Check if the current element is less than the previous element
		if (arr[index - 1] < arr[index - 2]) return 0;
		// Recursively check the rest of the array
		return checkIfArrayIsSortedOrNot(arr, index - 1);
	}
}
