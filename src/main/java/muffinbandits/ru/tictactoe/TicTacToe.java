package muffinbandits.ru.tictactoe;
import java.util.Scanner;

public class TicTacToe {

	public static final int ROWS = 3, COLUMS = 3;
	public static final int[][] board = new int[ROWS][COLUMS];
	public static final int X = 0;
	public static final int O = 1;
	public static final int Start = 2;
	public static int player = 0;

	public static Players p1 = new Players();
	public static Players p2 = new Players();


	//http://www.mkyong.com/java/how-to-read-input-from-console-java/
	public static Scanner scanIn = new Scanner(System.in);

	public static void main(String[] args)
	{


		System.out.println("-------------"); 
		System.out.println("--TicTacToe--");
		System.out.println("-------------");
		System.out.println();

		getPlayers();

		makeBoard();

		// board[0][0] = X;
		// board[1][1] = X;
		// board[2][2] = X;

		print();
		playing();
		print();
	}

	public static void getPlayers() 
	{
		String p1Name = "Player1";
		String p2Name = "Player2";

		System.out.println("Player 1 what is your name ?");
		p1Name = scanIn.nextLine();

		if (p1Name.isEmpty()) {
			p1Name = "Player1";
		}

		p1.setName(p1Name);
		
		System.out.println("Player 2 what is your name ?");
		p2Name = scanIn.nextLine();

		if (p2Name.isEmpty()) {
			p2Name = "Player2";
		}

		p2.setName(p2Name);

		System.out.println("Welcome "+ p1Name + " and " + p2Name);
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
		int r, c;
		boolean fool;

		while (true) {

		if(player == 0)
		{
			System.out.println("It's your move " + p1.getName() + ", (O) valid move Row[0-2] Colum[0-2]: ");
			player = 1;
		}
		else
		{
			System.out.println("It's your move  "  + p2.getName() +" , (X) valid move Row[0-2] Colum[0-2]: ");
			player = 0;
		}

		do
		{	
		//http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#nextInt()
		r = scanIn.nextInt();
		c = scanIn.nextInt();

		if(r > 2 || r < 0 || c > 2 || c < 0)
		{
			System.out.println("Not a valid move, please try again: ");
			fool = false;
		}
		else
		{
			fool = true;
		}
		}while(fool != true);

		if(board[r][c] == Start)
		{
			board[r][c] = player;
			print();
		} else {
			System.out.println("Field already taken please try again");
		}
		
		}
	}



}
