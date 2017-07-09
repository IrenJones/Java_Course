package homework20170704;

public class Array3 {

	public int[] fix34(int[] nums) {
		int tmp = 0;
		int prev = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3 && nums[i + 1] != 4) {
				for (int j = prev; j < nums.length; j++) {
					if (nums[j] == 4 && nums[j - 1] != 3) {
						tmp = nums[i + 1];
						nums[i + 1] = nums[j];
						nums[j] = tmp;
						prev = j;
						break;
					}
				}
			}
		}
		return nums;
	}

	public int[] fix45(int[] nums) {
		int tmp = 0;
		int prev = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 4 && nums[i + 1] != 4) {
				for (int j = prev; j < nums.length; j++) {
					if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
						tmp = nums[i + 1];
						nums[i + 1] = nums[j];
						nums[j] = tmp;
						prev = j;
						break;
					}
				}
			}
		}
		return nums;
	}

	public int[] squareUp(int n) {
		int[] arr = new int[n * n];
		int c = n * n - 1;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - i - 1; j < n; j++) {
				arr[c - n + j + 1] = n - j;
			}
			c -= n;
		}
		return arr;
	}

	public int[] seriesUp(int n) {
		int[] r = new int[n * (n + 1) / 2];
		int k = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				r[k] = j;
				k++;
			}
		}
		return r;
	}

	public static void main(String[] args) {
		int[] r = { 5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5 };
		// System.out.println(Arrays.toString(fix34(r)));
	}
}