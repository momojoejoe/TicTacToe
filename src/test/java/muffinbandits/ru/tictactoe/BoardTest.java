package muffinbandits.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testisLegal() {

		assertEquals(true, Board.isLegal(2));
		assertEquals(false, Board.isLegal(-2));
		// assertEquals(false, checkIfLegalMove(0,3));
	}

	@Test
	public void testCord() {

		Board b = new Board();

		b.setYcord("1,0");
		b.setXcord("1,0");
		assertEquals(1, b.getXcord());
		assertEquals(0, b.getYcord());

	}

	//testa exception
	@Test(expected = Exception.class)
	public void testCordExcept() {

		Board b1 = new Board();
		Board b2 = new Board();

		b2.setXcord("0,4");
		b2.setYcord("0,4");
		assertEquals(0, b2.getXcord());
		assertEquals("Y cord not allowed", b2.getYcord());

		b1.setXcord("3,0");
		b1.setYcord("3,0");
		assertEquals("X cord not allowed", b1.getXcord());
		assertEquals(0, b1.getYcord());
	}

	@Test
	public void testLegalPlayer() {
		assertEquals(true, Board.isLegalPlayer(1));
		assertEquals(true, Board.isLegalPlayer(0));
		assertEquals(false, Board.isLegalPlayer(2));
		assertEquals(false, Board.isLegalPlayer(-1));
	}

	@Test
	public void testWinner() {
		Board b3 = new Board();

		b3.makeMove(0,"0,0");
		b3.makeMove(0,"1,1");
		b3.makeMove(0,"2,2");

		assertEquals(true, b3.checkwinner(0));
	
		Board b4 = new Board();

		b4.makeMove(0,"0,2");		
		b4.makeMove(0,"1,1");
		b4.makeMove(0,"2,0");

		assertEquals(true, b4.checkwinner(0));

		Board b5 = new Board();

		b5.makeMove(0,"0,0");		
		b5.makeMove(0,"1,0");
		b5.makeMove(0,"2,0");

		assertEquals(true, b5.checkwinner(0));

		Board b6 = new Board();

		b6.makeMove(0,"0,1");		
		b6.makeMove(0,"1,1");
		b6.makeMove(0,"2,1");

		assertEquals(true, b6.checkwinner(0));
	
		Board b7 = new Board();

		b7.makeMove(0,"0,2");		
		b7.makeMove(0,"1,2");
		b7.makeMove(0,"2,2");

		assertEquals(true, b7.checkwinner(0));
		
		Board b8 = new Board();

		b8.makeMove(0,"0,0");		
		b8.makeMove(0,"0,1");
		b8.makeMove(0,"0,2");

		assertEquals(true, b8.checkwinner(0));

		Board b9 = new Board();

		b9.makeMove(0,"1,0");		
		b9.makeMove(0,"1,1");
		b9.makeMove(0,"1,2");

		assertEquals(true, b9.checkwinner(0));

		Board b10 = new Board();

		b10.makeMove(0,"2,0");		
		b10.makeMove(0,"2,1");
		b10.makeMove(0,"2,2");

		assertEquals(true, b10.checkwinner(0));
	}

	
}	