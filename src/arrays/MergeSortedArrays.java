package arrays;

/*
 * Approach:
 * 1. keep counters on both the arrays in starting position 
 * 2. compare the elements from both the arrays and increment the counter for the array whose element is pushed to the merged array 
 * 3. start iterating until any of the array counter reaches the end
 * 4. simply copy the content from the array which still has elements left
 */
public class MergeSortedArrays {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,4};
		int b[] = { 2,5,6 };

		int mLength = a.length + b.length;

		int mergedArray[] = new int[mLength];
		int aindex = 0;
		int bindex = 0;

//		for (int mindex = 0; mindex < mLength; mindex++) {
//			if (aindex == a.length) {
//				copyAll(b, bindex, mindex, mergedArray);
//				break;
//			}
//			if (bindex == b.length) {
//				copyAll(a, aindex, mindex,mergedArray);
//				break;
//			}
//			if ( a[aindex] < b[bindex]) {
//				mergedArray[mindex] = a[aindex];
//				aindex++;
//			} else {
//				mergedArray[mindex] = b[bindex];
//				bindex++;
//			}
//		}
		//alternate approach
		int mindex=0;
		while( aindex< a.length && bindex<b.length ) {
			if( a[aindex] < b[bindex] ) {
				mergedArray[mindex] = a[aindex];
				aindex++;
				mindex++;
			}else {
				mergedArray[mindex] = b[bindex];
				bindex++;
				mindex++;
			}
		}
		
		while(aindex < a.length) {
			mergedArray[mindex] = a[aindex];
			aindex++;
			mindex++;
		}
		while(bindex < b.length) {
			mergedArray[mindex] = b[bindex];
			bindex++;
			mindex++;
		}	
		
		System.out.println("Merged array :");
		for(int element : mergedArray) {
			System.out.print(element + " , ");
		}
	}

	private static void copyAll(int[] source, int sourceindex, int destIndex, int[] dest) {

		while(sourceindex < source.length) {
			dest[destIndex] = source[sourceindex];
			destIndex++;
			sourceindex++;
		}
	}

}
