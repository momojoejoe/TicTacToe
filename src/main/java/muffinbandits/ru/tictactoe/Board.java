package muffinbandits.ru.tictactoe;

public class Board {

	public static final int ROWS = 3, COLUMS = 3;
	public static final int[][] board = new int[ROWS][COLUMS];

	public static final int Start = 2;
	public static int player = 0;

	private static int X = 0;
	private static int Y = 0;


	public static void makeBoard() {

    	for(int i = 0; i < ROWS; i++) {

      		for(int j = 0; j < COLUMS; j++) {
      			board[i][j] = Start;
      		}
  		}
	}


	public static void makeMove(String player, String cellId) {

		setYcord(cellId);
		setXcord(cellId);



	}

	public static void setXcord(String cellId) {

		String[] a = cellId.split(",");

		X = Integer.parseInt(a[0]);

		if (!isLegal(X)) {
			throw new IllegalArgumentException("X cord not allowed");
		}
		
	}

	public static void setYcord(String cellId) {

		String[] a = cellId.split(",");

		Y = Integer.parseInt(a[1]);

		if (!isLegal(Y)) {
			throw new IllegalArgumentException("Y cord not allowed");
		}

	}

	public int getXcord() {
		return X;
	}
	public int getYcord() {
		return Y;
	}

	public static boolean isLegal(int x) {

		if (x > 2 || x < 0) {
			return false;
		} 
		return true;
	}

}