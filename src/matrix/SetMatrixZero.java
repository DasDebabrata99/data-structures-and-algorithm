package matrix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {

	public void setZeroMatrix() {
		int matrix[][] = { { 0,1,2,0 }, {3,4,5,2 }, { 1,3,1,5 } };
		int element;
		
		Set rows = new HashSet();
		Set columns = new HashSet();
		
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {
				element = matrix[row][column];
				if (element == 0) {
					//transformMatrix(row, column, matrix);
					rows.add(row);
					columns.add(column);

				}
			}
		}
		
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {
				if(rows.contains(row) || columns.contains(column)) {
				      matrix[row][column] = 0;
				}
			}
		}
	
	
	
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " , ");
		}
			System.out.println();
		}
		
    }

	public void transformMatrix(int row, int column, int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int col = 0; col < matrix[r].length; col++) {
				if (col == column || r == row) {
					matrix[r][col] = 0;
					System.out.println("setting zero at row, column " + r + "|" + col);
				}
			}
		}
	}

	public void transforMatrix(HashMap coordinates, int[][] matrix) {

	}

	public static void main(String[] args) {
		SetMatrixZero instance = new SetMatrixZero();
		instance.setZeroMatrix();
	}

}
