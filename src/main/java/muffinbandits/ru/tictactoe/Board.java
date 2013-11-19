package muffinbandits.ru.tictactoe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Board {

	public static final int ROWS = 3, COLUMS = 3;
	public static final int[][] board = new int[ROWS][COLUMS];

	public static final int Start = 2;
	public static int player = 0;

	private static int X = 0;
	private static int Y = 0;
	private static int turns = 0;
	private static int boardId =  0;



	public void testConnect() {
    String dbUrl = "jdbc:mysql://46.149.30.141:3306/muff";
    String dbClass = "com.mysql.jdbc.Driver";
    String query = "Select * from band";
    String username = "root";
    String password = "muffin";
   

       try {

        Class.forName(dbClass);
        Connection connection = DriverManager.getConnection(dbUrl,
            username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
        String tableName = resultSet.getString(1);
        System.out.println("Table name : " + tableName);
        }
        connection.close();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
    
















	public static void makeBoard() {

		// this.boardId = qBid + 1;

    	for(int i = 0; i < ROWS; i++) {

      		for(int j = 0; j < COLUMS; j++) {
      			board[i][j] = Start;
      		}
  		}
	}


	public static String makeMove(int playerId, String cellId) {

		setYcord(cellId);
		setXcord(cellId);

		int tempX = getXcord();
		int tempY = getYcord();

		player = playerId;

		if (isLegalPlayer(player)) {

			if (board[tempX][tempY] == Start) {
				turns++;

				if (player == 0) {
					
					board[tempX][tempY] = 0;
					if(turns == 9)
					{
						if(checkwinner(0))
						{
							return "win,0";
						}
						else
						{
							return "draw,0";
						}
					}
					else if (checkwinner(0))
					{
						return "win,0";
					}

					//skila done og nyja playerId (1)
					return "ok,0";
				} else if (player == 1) {

					board[tempX][tempY] = 1;
					if(turns == 9)
					{
						if(checkwinner(1))
						{
							return "win,1";
						}
						else
						{
							return "draw,1";
						}
					}
					else if(checkwinner(1))
					{
						return "win,1";
					}
					
					//skila done og nyja playerId
					return "ok,1";
				}

			} else {
				//occupied skila false og sama playerId
				return "no," + playerId;
				}

		} else {
		//not legal player throw exception!
			return "error";
	}
	return "foo";

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

	public static int getXcord() {
		return X;
	}
	public static int getYcord() {
		return Y;
	}

	public static boolean isLegal(int x) {

		if (x > 2 || x < 0) {
			return false;
		} 
		return true;
	}

	public static boolean isLegalPlayer(int p) {

		if (p == 0 || p == 1) {
			return true;
		}
		return false;
	}

	public static boolean checkwinner(int player)
	{
		if(board[0][0] == player && board[1][1] == player && board[2][2] == player || board[0][2] == player && board[1][1] == player && board[2][0] == player)
		{
			return true;
		}
		else
		{
			for(int i = 0; i < ROWS ; i++)
			{
				for(int j = 0; j < COLUMS ; j++)
				{
					if(board[i][0] == player && board[i][1] == player && board[i][2] == player)
					{
						return true;
					}
					else if(board[0][j] == player && board[1][j] == player && board[2][j] == player)
					{
						return true;
					}
				}
			}
		}
		
		return false;
	}


}