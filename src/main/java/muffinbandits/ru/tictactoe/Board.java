package muffinbandits.ru.tictactoe;

/**
 * Created by: arni11, bjarnthor12, sigruns12, sindris12, sindri12, theodor11 & thordurt12
 * Copyright (c) 2013
 * Project: TicTacToe
 * Package: muffinbandits.ru.tictactoe
 * Date: 19/11/13
 */

/**
 * A board for the game.
 */
public class Board {

	/**
	 * Max values for row and columns.
	 */
	public static final int ROWS = 3, COLUMS = 3;
	/**
	 * The board.
	 */
	public static final int[][] BOARD = new int[ROWS][COLUMS];
	/**
	 * The board starting value.
	 */
	public static final int START = 2;
	/**
	 * Maximum turns.
	 */
	public static final int MAXTURN = 9;
	/**
	 * Player ID.
	 */
	public static int player = 0;

	private static int x = 0;
	private static int y = 0;
	private static int turns = 0;
	private static int boardId =  0;


	/**
	 * Constructor for the board.
	 */
	public Board() {

		turns = 0;

		/**
		 * 
		 */
    	for (int i = 0; i < ROWS; i++) {

      		for (int j = 0; j < COLUMS; j++) {
      			BOARD[i][j] = START;
      		}
  		}
	}

	/**
	 * Takes care of putting the correct values into the board.
	 * @param  playerId the ID of the player.
	 * @param  cellId   where the player wants to make his move.
	 * @return          if  move is valid or not.
	 */
	public static String makeMove(int playerId, String cellId) {

		setYcord(cellId);
		setXcord(cellId);

		int tempX = getXcord();
		int tempY = getYcord();

		player = playerId;

		/**
		 * Checks if player ID is legal.
		 */
		if (isLegalPlayer(player)) {

			if (BOARD[tempX][tempY] == START) {
				turns++;


				if (player == 0) {

					BOARD[tempX][tempY] = player;

					if (turns == MAXTURN) {

						if (!checkDraw(player)) {

							return "win,0";

						} 
						else {

							return "draw,0";
						}

					} 
					else if (checkWinner(player)) {

						return "win,0";
					}

					return "ok,0";

				} 
				else if (player == 1) {

					BOARD[tempX][tempY] = player;

					if (turns == MAXTURN) {

						if (!checkDraw(player)) {

							return "win,1";

						} 
						else {

							return "draw,1";
						}

					} 
					else if (checkWinner(player)) {

						return "win,1";
					}
					
					return "ok,1";
				}

			} 
			else {

				return "no," + player;
			}

		} 
		else {

			return "Player Not allowed";
		}
	return "Unknown error";

	}

	/**
	 * Set X coordinate.
	 * @param cellId the x and  y coordinate.
	 */
	public static void setXcord(String cellId) {

		String[] a = cellId.split(",");

		x = Integer.parseInt(a[0]);

		if (!isLegal(x)) {
			throw new IllegalArgumentException("X cord not allowed");
		}
		
	}

	/**
	 * Set Y coordinate.
	 * @param cellId the x and y coordinate.
	 */
	public static void setYcord(String cellId) {

		String[] a = cellId.split(",");

		y = Integer.parseInt(a[1]);

		if (!isLegal(y)) {
			throw new IllegalArgumentException("Y cord not allowed");
		}

	}

	/**
	 * Retrieve x coordinate.
	 * @return x coordinate.
	 */
	public static int getXcord() {
		return x;
	}

	/**
	 * Retrieve y coordinate.
	 * @return y coordinate.
	 */
	public static int getYcord() {
		return y;
	}

	/**
	 * Checks if  coordinate is legal.
	 * @param  cord the  coordinate.
	 * @return   true if it's legal else false.
	 */
	public static boolean isLegal(int cord) {

		if (cord > 2 || cord < 0) {

			return false;
		} 

		return true;
	}

	/**
	 * Checks if playerId is legal.
	 * @param  p player ID.
	 * @return   true if it's legal else false.
	 */
	public static boolean isLegalPlayer(int p) {

		if (p == 0 || p == 1) {

			return true;
		}

		return false;
	}

	/**
	 * Check if player has won the game.
	 * @param  player the player ID.
	 * @return        true if player has won else false.
	 */
	public static boolean checkWinner(int player) {

		/**
		 * Checks the diagonal line.
		 */
		if (BOARD[0][0] == player && BOARD[1][1] == player 
			&& BOARD[2][2] == player || BOARD[0][2] == player 
			&& BOARD[1][1] == player && BOARD[2][0] == player) {

			return true;
		} 
		else {

			/**
			 * Checks the straight line.
			 */
			for (int i = 0; i < ROWS; i++) {

				for (int j = 0; j < COLUMS; j++) {

					if (BOARD[i][0] == player && BOARD[i][1] == player && BOARD[i][2] == player) {

						return true;

					} 
					else if (BOARD[0][j] == player 
						&& BOARD[1][j] == player 
						&& BOARD[2][j] == player) {

						return true;
					}
				}
			}
		}
		
		return false;
	}

	/**
	 * Checks if game is draw.
	 * @param  player the player ID.
	 * @return        true if draw else false.
	 */
	public static boolean checkDraw(int player) {

		if (turns == MAXTURN && !(checkWinner(player))) {

			return true;
		}

		return false;
	}

}