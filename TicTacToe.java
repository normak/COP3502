public class TicTacToe {
	public static void main(String[] args) {
		int[][] board = new int[3][3];
		int total = 0;
		for (int r = 0; r < board.length; r++) {
         for (int c = 0; c < board.length; c++) {
				board[r][c] = Math.round((float)Math.random());
         }
      }
      for (int r = 0; r < board.length; r++) {
         for (int c = 0; c < board.length; c++) {
				if(c % 3 == 0) {
					System.out.println();
				}
				System.out.print(board[r][c] +" ");
         }
      }
      System.out.println();
		System.out.println();
		if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
			System.out.println("Row 1 has three " +board[0][0]+"'s!");	
		}
		if (board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
			System.out.println("Row 2 has three " +board[1][1]+"'s!");
		}
		if (board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
			System.out.println("Row 3 has three " +board[2][0]+"'s!");
		}
		if (board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
			System.out.println("Column 1 has three " +board[0][0]+"'s!");
		}
		if (board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
			System.out.println("Column 2 has three " +board[0][1]+"'s!");
		}
		if (board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
			System.out.println("Column 3 has three " +board[0][2]+"'s!");
		}
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			System.out.println("There are three " +board[0][0]+"'s!");
		}
		if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			System.out.println("There are three " +board[0][2]+"'s!");
		}
   }
}
