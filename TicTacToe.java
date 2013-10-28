import java.util.Scanner;

public class TicTacToe {

	public static final int ROWS = 3, COLUMS = 3;
	public static final int[][] board = new int[ROWS][COLUMS];
	public static final int X = 0;
	public static final int O = 1;
	public static final int Start = 2;
	public static int player = 0; 

	//http://www.mkyong.com/java/how-to-read-input-from-console-java/
	public static Scanner scanIn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("-------------"); 
		System.out.println("--TicTacToe--");
		System.out.println("-------------");
		System.out.println();

		makeBoard();

		board[0][0] = X;
		board[1][1] = X;
		board[2][2] = X;

		print();
		playing();
		print();
	}

	public static void makeBoard()
	{
		for(int i = 0; i < ROWS; i++)
		{
			for(int j = 0; j < COLUMS; j++)
			{
				board[i][j] = Start;
			}
		}
	}

	public static void print()
	{
		System.out.println("-------------");

		for(int i = 0; i < ROWS; i++)
		{
			System.out.print("|");
			for(int j = 0; j < COLUMS; j++)
			{
				if(board[i][j] == X)
				{
					System.out.print(" X ");
				}
				else if(board[i][j] == O)
				{	
					System.out.print(" 0 ");
				}
				else
				{
					System.out.print(" - ");
				}
				System.out.print("|");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	//This function is not finished.
	public static void playing()
	{
			if(player == X)
			{
				System.out.println("It's your move Player X, valid move Row[0-2] Colum[0-2]: ");
			}
			else
			{
				System.out.println("It's your move Player O, valid move Row[0-2] Colum[0-2]: ");
			}
			//http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#nextInt()
			int r = scanIn.nextInt();
			int c = scanIn.nextInt();

			if(board[r][c] == Start)
			{
				board[r][c] = player;
			}
	}

}
