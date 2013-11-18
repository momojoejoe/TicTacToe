package muffinbandits.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayersTest {

	@Test
	public void greetResultsInPlayers() {
		Players p = new Players();
		assertEquals("Hello sir", p.greet());
	}

	@Test
	public void testPlayerId() {
		Players p1 = new Players();
		p1.setPlayerId(2);
		assertEquals(2, p1.getPlayerId());
	}

	@Test
	public void testPlayerName() {
		Players p1 = new Players();
		p1.setName("Sindri");
		assertEquals("Sindri", p1.getName());
	}
}