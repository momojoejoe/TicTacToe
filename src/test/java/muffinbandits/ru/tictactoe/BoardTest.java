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

	
}