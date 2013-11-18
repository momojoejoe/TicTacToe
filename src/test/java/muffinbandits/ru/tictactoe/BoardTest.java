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

	
}