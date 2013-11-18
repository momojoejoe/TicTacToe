package muffinbandits.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testisLegal() {

		assertEquals(true, Board.isLegal(2,2));
		// assertEquals(false, checkIfLegalMove(0,3));
	}

	// @Test
	// public void checkiflegal2() {

	// 	assertEquals(false, checkIfLegalMove(0,3));
	// }
}