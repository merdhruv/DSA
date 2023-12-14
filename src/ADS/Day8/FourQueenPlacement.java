package in.cdac.blr.day8;

public class FourQueenPlacement {

	final int boardsize = 8;
	
	/* 
	 * This function returns false if the queens cannot be placed, otherwise returns true
	 */
	boolean startTracking() {
		int arr[][] = {{0,0,0,0,0,0,0,0}, 
						{0,0,0,0,0,0,0,0}, 
						{0,0,0,0,0,0,0,0}, 
						{0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0}}; // 4X4 chess board representation
		
		if(backTrackingLogic(arr, 0) == false) {
			return false;
		}
		displayQueens(arr);
		return true;
	}
	
	boolean backTrackingLogic(int arr[][], int col) {
		// check if the column 'col' in which the queen is to be placed is within the chess board bounds
		if(col >= boardsize)
			return true;  // returning true implies that all queens have been successfully placed
		
		for(int i=0; i<boardsize; i++) {
			// place the 'ith' queen in column 'col'
			if(placeTheQueenAt(arr, i, col)) {
				arr[i][col] = 1;
				if(backTrackingLogic(arr, col+1) == true)
					return true;
				arr[i][col] = 0;   // queen not placed, go for backtracking
			}
		}
		return false;
	}
	
	boolean placeTheQueenAt(int arr[][], int row, int col) {
		int i,j;
		// check the current row along its left
		for(i=0;i<col;i++) {
			if(arr[row][i] == 1)   // meaning queen already present at row,i coordinates
				return false;
		}
		
		for(i=row, j=col; i>=0 && j>=0; i--, j--) {
			if(arr[i][j]==1)
				return false;
		}
		
		for(i=row, j=col; j>=0 && i<boardsize; i++, j--) {
			if(arr[i][j]==1)
				return false;
		}
		return true;  // meaning the queen can be place at row,col coordinates
	}

	void displayQueens(int arr[][]) {
		for(int i=0; i<boardsize; i++) {
			for(int j=0; j<boardsize; j++) {
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		FourQueenPlacement q = new FourQueenPlacement();
		q.startTracking();
	}

}
