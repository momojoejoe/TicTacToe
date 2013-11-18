package muffinbandits.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testisLegal() {

		assertEquals(true, Board.isLegal(2));
		// assertEquals(false, checkIfLegalMove(0,3));
	}

	@Test
	public void testCord() {

		assertEquals(1, Board.getXCord("1,0"));
		assertEquals(0, Board.getYCord("1,0"));
	}

	
}