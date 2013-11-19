package muffinbandits.ru.tictactoe;
import static spark.Spark.*;
import spark.*;
import java.util.Scanner;

public class TicTacToe {


	public static Players p1 = new Players();
	public static Players p2 = new Players();
	public static Board b = new Board();


	//http://www.mkyong.com/java/how-to-read-input-from-console-java/
	public static Scanner scanIn = new Scanner(System.in);

	public static void main(String[] args)
	{


		
    staticFileLocation("/public");
        
         setPort(Integer.valueOf(System.getenv("PORT"))); // broken!

        post(new Route("/add") {
            @Override
            public Object handle(Request request, Response response) {

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

	

	
}
