package leetcode.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class twoArrayIntersection {
	public static void main(String[] args) {
		int[] num1 = {4, 9, 5};
		int[] num2 = {9, 4, 9, 8, 4};
		int[] result = solution(num1, num2);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] num1, int[] num2) {
		HashMap<Integer, Integer> num1Map = new HashMap<>();
		ArrayList<Integer> resultArray = new ArrayList<>();

		for (int i : num1) {
			if (num1Map.containsKey(i)) {
				num1Map.put(i, num1Map.get(i) + 1);
			} else {
				num1Map.put(i, 1);
			}
		}

		for (int i : num2) {
			if (num1Map.containsKey(i) && num1Map.get(i) > 0) {
				resultArray.add(i);
				num1Map.put(i, num1Map.get(i) - 1);
			}
		}

		int[] result = new int[resultArray.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = resultArray.get(i);
		}

		return result;
	}
}
