package recursion;

public class towerOfHanoi {
	public static void main(String[] args) {
		TowerOfHanoi(5, 'A', 'C', 'B');
	}

	public static void TowerOfHanoi(int n, char frompeg, char topeg, char auxpeg) {
		if (n == 1) {
			System.out.println("Move disk 1 from peg " + frompeg + " to peg " + topeg);
			return;
		}
		// Move n - 1 disks from A to B, using C auxiliary rod
		TowerOfHanoi(n - 1, frompeg, auxpeg, topeg);

		// Move remaining disk from A to C
		System.out.println("Move disk " + n + " from peg " + frompeg + " to peg " + topeg);

		// Move n - 1 disks from B to C, using A auxiliary rod
		TowerOfHanoi(n - 1, frompeg, auxpeg, topeg);
	}
}
