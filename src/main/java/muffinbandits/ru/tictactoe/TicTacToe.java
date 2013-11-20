package muffinbandits.ru.tictactoe;
import static spark.Spark.*;
import spark.*;

/**
 * Created by: arni11, bjarnthor12, sigruns12, sindris12, sindri12, theodor11 & thordurt12
 * Copyright (c) 2013
 * Project: TicTacToe
 * Package: muffinbandits.ru.tictactoe
 * Date: 19/11/13
 */

/**
 * The instance of TicTacToe.
 */
public class TicTacToe {

    /**
     * Player 1.
     */
	public static Players p1 = new Players();

    /**
     * Player 2.
     */
	public static Players p2 = new Players();

    /**
     * The board that is about to be played.
     * @return clean board.
     */
	public static Board b = new Board();

    /**
     * Ignites spark.
     * @param args none.
     */
	public static void main(String[] args) {

        staticFileLocation("/public");
        

       	if (System.getenv("PORT") == null) {

            setPort(4567);
        }
        else {

            setPort(Integer.valueOf(System.getenv("PORT")));
        }

        /**
         * The game has started and names and id will be set.
         * @param  "/add" go to new game.
         * @return        true.
         */
        post(new Route("/add") {
            @Override
            public Object handle(Request request, Response response) {

            	Board b1 = new Board();

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

        /**
         * Handles the moves.
         * @param  "/play" takes in playerId and the coordinates.
         * @return         the results of the move.
         */
         post(new Route("/play") {
            @Override
            public Object handle(Request request, Response response) {
                String player = String.valueOf(request.queryParams("player"));
                String cell = String.valueOf(request.queryParams("cellId"));
                String result = "";

                int pId = Integer.parseInt(player);

                if (pId == 0) {

                	result = b.makeMove(0, cell);

                } 
                else if (pId == 1) {

                	result = b.makeMove(1, cell);
                }

                return result;
            }
        });

	}

	
}
