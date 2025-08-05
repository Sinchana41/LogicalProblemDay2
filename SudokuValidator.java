package com.logicalproblems;

public class SudokuValidator {
	

	    public static boolean isValidSudoku(char[][] board) {
	       
	        boolean[][] rows  = new boolean[9][9];
	        boolean[][] cols  = new boolean[9][9];
	        boolean[][] boxes = new boolean[9][9];

	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                char ch = board[i][j];

	                if (ch != '.') {
	                    int num = ch - '1';  // Convert char to 0-based index (0 to 8)
	                  
	                    int boxIndex = (i / 3) * 3 + (j / 3);

	                    if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
	                        return false;
	                    }

	                    rows[i][num] = true;
	                    cols[j][num] = true;
	                    boxes[boxIndex][num] = true;
	                }
	            }
	        }
	        return true;
	    }
}
