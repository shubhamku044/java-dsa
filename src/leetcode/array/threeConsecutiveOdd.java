package leetcode.array;

public class threeConsecutiveOdd {
	public static void main(String[] args) {
		int[] arr = {1, 2, 34, 3, 4, 5, 23, 12};
		System.out.println(isThreeConsecutiveOdds(arr));
	}

	/*
	Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.


	Example 1:

	Input: arr = [2,6,4,1]
	Output: false
	Explanation: There are no three consecutive odds.
	Example 2:

	Input: arr = [1,2,34,3,4,5,7,23,12]
	Output: true
	Explanation: [5,7,23] are three consecutive odds.
	*/
	static public boolean isThreeConsecutiveOdds(int[] arr) {
		int counter = 0;
		for (int j : arr) {
			if (j % 2 == 1) counter++;
			else counter = 0;

			if (counter == 3) return true;
		}
		return false;
	}
}
