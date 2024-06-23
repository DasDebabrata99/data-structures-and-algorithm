package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 *       1
 *      1 1
 *     1 2 1
 *    1 3 3 1
 *   1 4 6 4 1
 *  1 5 10 10 5 1
 *     
 */
class PascalTriangleBruteForce {
    public List<List<Integer>> generate(int numRows) {
    	 
    	List<List<Integer>> pt = new ArrayList<>();
    	
    	ArrayList firstRow = new ArrayList<>();
    	firstRow.add(1);
    	ArrayList secondRow = new ArrayList<>();
    	secondRow.add(1);
    	secondRow.add(1);
        if(numRows > 0 ){
    	    pt.add(firstRow);
            if(numRows > 1 ){
    	    pt.add(secondRow);
            }
        }
        ArrayList row ;
    	for(int i = 1; i < numRows; i++) {
    		row = new ArrayList();
    		row.add(1);
    		
    		for(int j=1; j<=i ; j++ ) {
    			
    			row.add(pt.get(i).get(j-1) + pt.get(i).get(j) );
    			
    		}
    		row.add(1);
            
    		pt.add(row);
            
  	    }
    	
    	System.out.println(pt);
    	return pt;
    }
    
    public static void main(String[] args) {
    	PascalTriangleBruteForce instance = new PascalTriangleBruteForce();
		instance.generate(4);
	}
}
