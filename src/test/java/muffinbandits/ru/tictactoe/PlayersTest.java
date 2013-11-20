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
 * Tests the Player class.
 */
public class PlayersTest {

	/**
	 * Test player ID.
	 */
	@Test
	public void testPlayerId() {
		Players p1 = new Players();
		p1.setPlayerId(2);
		assertEquals(2, p1.getPlayerId());
	}

	/**
	 * Test player name.
	 */
	@Test
	public void testPlayerName() {
		Players p1 = new Players();
		p1.setName("Sindri");
		assertEquals("Sindri", p1.getName());
	}
}