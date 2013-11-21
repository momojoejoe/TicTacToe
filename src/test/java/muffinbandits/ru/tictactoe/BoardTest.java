package muffinbandits.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by: arni11, bjarnthor12, sigruns12, sindris12, sindri12, theodor11 & thordurt12
 * Copyright (c) 2013
 * Project: TicTacToe
 * Package: muffinbandits.ru.tictactoe
 * Date: 19/11/13
 */

/**
 * Tests for the Board class.
 */
public class BoardTest {


	/**
	 * Checks if coordinate is legal.
	 */
	@Test
	public void testisLegal() {


		assertEquals(true, Board.isLegal(2));
		assertEquals(false, Board.isLegal(-2));
	}

	/**
	 * Check if set and get coordinates are legal.
	 */
	@Test
	public void testCord() {

		Board b = new Board();

		b.setYcord("1,0");
		b.setXcord("1,0");
		assertEquals(1, b.getXcord());
		assertEquals(0, b.getYcord());

	}

	/**
	 * Tests Ycord exceptions.
	 */
	@Test(expected = Exception.class)
	public void testYCordExcept() {

		Board b2 = new Board();
		

		b2.setXcord("0,4");
		b2.setYcord("0,4");
		assertEquals(0, b2.getXcord());
		assertEquals("Y cord not allowed", b2.getYcord());

	}

	/**
	 * Tests Xcord exceptions.
	 */
	@Test(expected = Exception.class)
	public void testXCordExcept() {

		Board b1 = new Board();

		b1.setXcord("3,0");
		b1.setYcord("3,0");
		assertEquals(0, b1.getYcord());
		assertEquals("X cord not allowed", b1.getXcord());
	}

	/**
	 * Check if player ID is legal.
	 */
	@Test
	public void testLegalPlayer() {
		assertEquals(true, Board.isLegalPlayer(1));
		assertEquals(true, Board.isLegalPlayer(0));
		assertEquals(false, Board.isLegalPlayer(2));
		assertEquals(false, Board.isLegalPlayer(-1));
		
	}

	/**
	 * Check if player is legal in makeMove.
	 */
	@Test
	public void testPlayerinMove() {

		assertEquals("Player Not allowed", Board.makeMove(4, "0,1"));
		assertEquals("Player Not allowed", Board.makeMove(3, "0,1"));
		assertEquals("Player Not allowed", Board.makeMove(-2, "0,1"));
	}


	/**
	 * Checks all winning scenarios for player1.
	 */
	@Test
	public void testWinnerP1() {
		Board b3 = new Board();

		b3.makeMove(0, "0,0");
		b3.makeMove(0, "1,1");
		b3.makeMove(0, "2,2");

		
	
		Board b4 = new Board();

		b4.makeMove(0, "0,2");		
		b4.makeMove(0, "1,1");
		b4.makeMove(0, "2,0");

		

		Board b5 = new Board();

		b5.makeMove(0, "0,0");		
		b5.makeMove(0, "1,0");
		b5.makeMove(0, "2,0");

		

		Board b6 = new Board();

		b6.makeMove(0, "0,1");		
		b6.makeMove(0, "1,1");
		b6.makeMove(0, "2,1");

		
	
		Board b7 = new Board();

		b7.makeMove(0, "0,2");		
		b7.makeMove(0, "1,2");
		b7.makeMove(0, "2,2");

		
		
		Board b8 = new Board();

		b8.makeMove(0, "0,0");		
		b8.makeMove(0, "0,1");
		b8.makeMove(0, "0,2");

		

		Board b9 = new Board();

		b9.makeMove(0, "1,0");		
		b9.makeMove(0, "1,1");
		b9.makeMove(0, "1,2");

		

		Board b10 = new Board();

		b10.makeMove(0, "2,0");		
		b10.makeMove(0, "2,1");
		b10.makeMove(0, "2,2");

		assertEquals(true, b3.checkWinner(0));
		assertEquals(true, b4.checkWinner(0));
		assertEquals(true, b5.checkWinner(0));
		assertEquals(true, b6.checkWinner(0));
		assertEquals(true, b7.checkWinner(0));
		assertEquals(true, b8.checkWinner(0));
		assertEquals(true, b9.checkWinner(0));
		assertEquals(true, b10.checkWinner(0));
		
	}

	/**
	 * Checks all winning scenarios for player2.
	 */
	@Test
	public void testWinnerP2() {
		Board b31 = new Board();

		b31.makeMove(1, "0,0");
		b31.makeMove(1, "1,1");
		b31.makeMove(1, "2,2");



		b31.makeMove(1, "0,0");
		b31.makeMove(1, "1,1");
		b31.makeMove(1, "2,2");

		
	
		Board b41 = new Board();

		b41.makeMove(1, "0,2");		
		b41.makeMove(1, "1,1");
		b41.makeMove(1, "2,0");

		

		Board b51 = new Board();

		b51.makeMove(1, "0,0");		
		b51.makeMove(1, "1,0");
		b51.makeMove(1, "2,0");

		

		Board b61 = new Board();

		b61.makeMove(1, "0,1");		
		b61.makeMove(1, "1,1");
		b61.makeMove(1, "2,1");

		
	
		Board b71 = new Board();

		b71.makeMove(1, "0,2");		
		b71.makeMove(1, "1,2");
		b71.makeMove(1, "2,2");

		
		
		Board b81 = new Board();

		b81.makeMove(1, "0,0");		
		b81.makeMove(1, "0,1");
		b81.makeMove(1, "0,2");

		

		Board b91 = new Board();

		b91.makeMove(1, "1,0");		
		b91.makeMove(1, "1,1");
		b91.makeMove(1, "1,2");

		

		Board b101 = new Board();

		b101.makeMove(1, "2,0");		
		b101.makeMove(1, "2,1");
		b101.makeMove(1, "2,2");

		

		assertEquals(true, b31.checkWinner(1));
		assertEquals(true, b41.checkWinner(1));
		assertEquals(true, b51.checkWinner(1));
		assertEquals(true, b61.checkWinner(1));
		assertEquals(true, b71.checkWinner(1));
		assertEquals(true, b81.checkWinner(1));
		assertEquals(true, b91.checkWinner(1));
		assertEquals(true, b101.checkWinner(1));
		
	}

	/**
	 * Checks if there is a draw.
	 */
	@Test
	public void drawTest() {

		Board bdraw = new Board();

		bdraw.makeMove(0, "0,0");
		bdraw.makeMove(1, "0,1");
		bdraw.makeMove(0, "0,2");
		bdraw.makeMove(1, "1,0");
		bdraw.makeMove(0, "1,2");
		bdraw.makeMove(1, "2,2");
		bdraw.makeMove(0, "2,0");
		bdraw.makeMove(1, "1,1");
		bdraw.makeMove(0, "2,1");

		assertEquals(false, bdraw.checkWinner(0));
		assertEquals(false, bdraw.checkWinner(1));
		assertEquals(true, bdraw.checkDraw(0));
	}

	/**
	 * Checks if winner after max turns.
	 */
	@Test
	public void maxTurnsWinner() {

		Board bturnswin = new Board();

		bturnswin.makeMove(0, "0,0");
		bturnswin.makeMove(1, "0,1");
		bturnswin.makeMove(0, "0,2");
		bturnswin.makeMove(1, "1,0");
		bturnswin.makeMove(0, "1,1");
		bturnswin.makeMove(1, "1,2");
		bturnswin.makeMove(0, "2,1");
		bturnswin.makeMove(1, "2,2");
		bturnswin.makeMove(0, "2,0");

		assertEquals(false, bturnswin.checkDraw(0));
		assertEquals(true, bturnswin.checkWinner(0));
		assertEquals(false, bturnswin.checkWinner(1));
	}
	
}	