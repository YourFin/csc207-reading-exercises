public class E2d14 {
	public static int max(int[] arr) {
		/*
		 * Loop Invariant: ret contains the smallest value in arr[0:i] where i is the
		 * current value of i or largest value we have seen so far. i defaults to 0.
		 */
		int ret = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < ret) {
				ret = arr[i];
			}
		}
		return ret;
	}
}
	
