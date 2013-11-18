package muffinbandits.ru.tictactoe;
import static spark.Spark.*;
import spark.*;
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

		
    staticFileLocation("/public");
        
        // setPort(Integer.valueOf(System.getenv("PORT"))); // broken!

        post(new Route("/add") {
            @Override
            public Object handle(Request request, Response response) {
                String a = String.valueOf(request.queryParams("a"));
                String b = String.valueOf(request.queryParams("b"));

                if (a == "") {
                	p1.setName("Player1");
                }
                if (b == "") {
                	p2.setName("Player2");
                }

                p1.setName(a);
                p2.setName(b);

                return true;
            }
        });


		
	}

	

	
}
