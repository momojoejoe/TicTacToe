package muffinbandits.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayersTest {

	@Test
	public void greetResultsInPlayers() {
		Players p = new Players();
		assertEquals("Hello sir", p.greet());
	}
}