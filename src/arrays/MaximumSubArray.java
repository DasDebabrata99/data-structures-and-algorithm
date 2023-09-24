package arrays;
/*
 * we will discard the sub array whose sum is negative, since it will only reduce the sum of subsequent subarrays
 * and we will start afresh from the next index
 * 
 */
public class MaximumSubArray {

	public static void main(String[] args) {
		int a[] = { -9, -1, 4, -1, 2, -1, 5, -3 };
		int n = a.length;
		maxSubArraySum(a, n);
	}

	private static void maxSubArraySum(int[] a, int n) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum=0;
		int start=0;
		int end = 0;
		int subStart=0;
		
		for(int i = 0; i<a.length; i++) {
			currentSum+=a[i];
			
			if(currentSum > maxSum ) {
				maxSum = currentSum;
				start = subStart;
				end = i;
			}
			
			if(currentSum < 0) {
				currentSum=0;
				subStart = i+1;
			}			
		}
		System.out.println("Maximum contiguous sum is " + maxSum);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
		
	}
}
