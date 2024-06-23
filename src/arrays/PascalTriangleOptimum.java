package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * /*
 *       1
 *      1 1
 *     1 2 1
 *    1 3 3 1
 *   1 4 6 4 1
 *  1 5 10 10 5 1
 *     
 *  for any element[row][col] in pascal's trianle we have to go with this formula:
 *  nCr, where n = row-1, r = col-1
 *  calculating nCr:
 *   we know nCr = n!/r!(n-r)!
 *   this can be simplified to n*n-1*n-2*...n /1*2*3...n  
 *   
 *   element[6][3]
 *   eg: 5C2 = 5*4*3*2*1/2*1 *(3*2*1) = 5*4/2*1 = 5/1 *4/2 =10
 *     
 */
 
public class PascalTriangleOptimum {

	public long getElement(int row, int col) {
		int n = row-1; //5
		int r = col-1;//2
		long result=1;
		for(int i = 0; i<=r;i++) {// 1*5/1=5  , 5*4/2=10 
			result = result * (n-i);
			result = result /(i+1);
		}
		return result;
				
	}
	
	public static void main(String[] args) {
		PascalTriangleOptimum instance = new PascalTriangleOptimum();
		long res = instance.getElement(6, 3);
		System.out.println(res);
		
		System.out.println(instance.getRow(6));
		System.out.println(instance.generateTriangle(6));
	}
	
	
	/*
	 * getting the entire given row
	 * we could use the above formula :
	 * but the complexity would go O(n*r)
	 * 
	 * 
	 *       1
     *      1 1
     *     1 2 1
     *    1 3 3 1
     *   1 4 6 4 1
     *  1 5 10 10 5 1
	 * eg:6th row
	 * 
	 * 1 , 5C1 , 5C2 , 5C3 , 5C4 , 1
	 * 
	 *  5/1 , 5*4 / 1*2 , 5*4 *3/1*2*3 , 5*4*2*3*1/1*2*3*4, 5*4*3*2*1/1*2*3*4*5
	 *  
	 *  5/1, (5/1) *4/2. (5*4/1*2) * 3/3 , (5*4*3/1*2*3) * 2/4,  5C5 (5*4*3*2/1*2*3*4)  * (1/5)
	 *  numerator = row-i
	 *  denom = i
	 *  
	 * for(int i=1;i<row;i++){
	 *     res = res*(row-i)
	 *     res = res/i	  
	 * 
	 * }
	 */
	public List getRow(int row) {
		List<Long> rowList = new ArrayList();
		rowList.add(1l);
		long res=1;
		for(int i=1 ; i<row; i++) {
			res = res*(row-i);
			res = res/i;
			rowList.add(res);
		}
		return rowList;
	}
	
	public List<List<Long>> generateTriangle(int rowNum) {
		List<List<Long>> triangle = new ArrayList<>();
		for(int i =1 ; i<rowNum; i++) {
			triangle.add(getRow(i));
		}
		return triangle;
	}
}
