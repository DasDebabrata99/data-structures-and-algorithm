package arrays;

/*
 * Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

   If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).
   
   Example 1 :

   Input format:
         Arr[] = {1,3,2}
   Output
       : Arr[] = {2,1,3}
   Explanation: 
   All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,1,3} , {2,3,1} , {3,1,2} , {3,2,1}}. 
   So, the next permutation just after {1,3,2} is {2,1,3}.
 */
public class NextPermutation {

	private int[] getNextPermutation( int[] arr) {
		int breakInd = -1;
		for(int i = arr.length-2 ; i >= 0; i--) {
			if(arr[i] < arr[i+1]) {
				breakInd = i;
				break;
			}
		}
		
		if(breakInd == -1) {
			//reverse the whole array 
		}
		
		//swap value at breaking index with the next largest value
		
		for(int i = arr.length - 1; i > breakInd; i--) {
			if(arr[i] > arr[breakInd]) {
				int element = arr[i];
				arr[i] = arr[breakInd] ;
				arr[breakInd] = element;
				break;
			}
		}
		
		//3. reverse the array after breakInd 
		// 4/2 = 2 [  4,3,2,1       1,3,2,4    1,2,3,4]
		// 5/2 =2  [1,2,3,4,5     5,2,3,4,1     5,4,3,2,1
		
		int mid = (arr.length - breakInd)/2;
		for( int count = 1; count < mid ; count ++) {
			int element = arr[breakInd + count];
			arr[breakInd + count] = arr[arr.length -1 -count] ;
			arr[arr.length -1 -count] = element;
					
		}
		return arr;
	}//                2,           3
	private void swap(int to , int from , int[] arr) {
		int element = arr[from];
		for(int i = from ;i> to; i--) {
			arr[i] = arr[i-1];
		}
		arr[to] = element;		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,2};
		NextPermutation np = new NextPermutation();
		int[] nextP = np.getNextPermutation(arr);
		
		for(int i=0; i< nextP.length; i++) {
			System.out.print(nextP[i] + ",");	
		}
		
	}
}
