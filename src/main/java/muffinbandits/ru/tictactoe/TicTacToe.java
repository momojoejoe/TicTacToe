package muffinbandits.ru.tictactoe;
import static spark.Spark.*;
import spark.*;
import java.util.Scanner;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class TicTacToe {


	public static Players p1 = new Players();
	public static Players p2 = new Players();
	public static Board b = new Board();




    public static Connection getConnection() throws Exception {

   		String dbClass = "com.mysql.jdbc.Driver";
    	String dbUrl = "jdbc:mysql://46.149.30.141:3306/muff";
    	String username = "muffin";
    	String password = "muffin";
    	Class.forName(dbClass);
    	Connection conn = DriverManager.getConnection(dbUrl, username, password);

    return conn;
  }


	//http://www.mkyong.com/java/how-to-read-input-from-console-java/
	public static Scanner scanIn = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		System.out.println("Tryin to connect");
		// makeConnection();
		System.out.println("Connection done");
		
    staticFileLocation("/public");
        
        // setPort(Integer.valueOf(System.getenv("PORT"))); // broken!

        post(new Route("/add") {
            @Override
            public Object handle(Request request, Response response) {
            	Board b1 = new Board();
            	b.makeBoard();
                String a = String.valueOf(request.queryParams("a"));
                String b = String.valueOf(request.queryParams("b"));

                if (a == "") {
                	p1.setName("Player1");
                }
                if (b == "") {
                	p2.setName("Player2");
                }



                p1.setName(a);
                p1.setPlayerId(0);

                p2.setName(b);
                p2.setPlayerId(1);

                // createInstance(p1.getName(), p2.getName());

                return true;
            }
        });


         post(new Route("/play") {
            @Override
            public Object handle(Request request, Response response) {
                String player = String.valueOf(request.queryParams("player"));
                String cell = String.valueOf(request.queryParams("cellId"));
                String result = "";

                int pId = Integer.parseInt(player);

                if (pId == 0) {
                	result = b.makeMove(0, cell);

                } else if (pId == 1) {
                	result = b.makeMove(1, cell);
                }


                return result;
            }
        });

	}


	public static void createInstance(String p1, String p2) throws Exception {


		
		Connection conn = null;
    	PreparedStatement pstmt = null;

		// try {
			conn = getConnection();
			String query = "INSERT INTO Gameinstances(p1Name, p2Name, winner, active) VALUES('sires','homo','homo',false)";

			// pstmt = conn.prepareStatement(query);

        // Class.forName(dbClass);
        // Connection connection = DriverManager.getConnection(dbUrl, username, password);
        // Statement statement = connection.createStatement();
        // ResultSet resultSet = statement.executeQuery(query);

        
        conn.close();
    // } catch (ClassNotFoundException e) {
    //     e.printStackTrace();
    // } catch (SQLException e) {
    //     e.printStackTrace();
    // }


	}



	


		
	

	

	
}
