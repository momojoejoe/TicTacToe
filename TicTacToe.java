public class TicTacToe {

	public static final int ROWS = 3, COLUMS = 3;
	public static final int[][] board = new int[ROWS][COLUMS];
	public static final int X = 0;
	public static final int O = 1;
	public static final int Start = 2;

	public static void main(String[] args) {
		System.out.println("-------------"); 
		System.out.println("--TicTacToe--");
		System.out.println("-------------");
		System.out.println();

		makeGame();

		board[2][1] = 0;

		print();
	}

	public static void makeGame()
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
		for(int i = 0; i < ROWS; i++)
		{
			System.out.print("|");
			for(int j = 0; j < COLUMS; j++)
			{
				if(board[i][j] == X)
				{
					System.out.print(" X ");
				}
				else if(board[i][j] == 0)
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
}
