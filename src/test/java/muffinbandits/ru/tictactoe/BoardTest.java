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
	public void testWinnerP1() {
		Board b3 = new Board();

		b3.makeMove(0,"0,0");
		b3.makeMove(0,"1,1");
		b3.makeMove(0,"2,2");

		
	
		Board b4 = new Board();

		b4.makeMove(0,"0,2");		
		b4.makeMove(0,"1,1");
		b4.makeMove(0,"2,0");

		

		Board b5 = new Board();

		b5.makeMove(0,"0,0");		
		b5.makeMove(0,"1,0");
		b5.makeMove(0,"2,0");

		

		Board b6 = new Board();

		b6.makeMove(0,"0,1");		
		b6.makeMove(0,"1,1");
		b6.makeMove(0,"2,1");

		
	
		Board b7 = new Board();

		b7.makeMove(0,"0,2");		
		b7.makeMove(0,"1,2");
		b7.makeMove(0,"2,2");

		
		
		Board b8 = new Board();

		b8.makeMove(0,"0,0");		
		b8.makeMove(0,"0,1");
		b8.makeMove(0,"0,2");

		

		Board b9 = new Board();

		b9.makeMove(0,"1,0");		
		b9.makeMove(0,"1,1");
		b9.makeMove(0,"1,2");

		

		Board b10 = new Board();

		b10.makeMove(0,"2,0");		
		b10.makeMove(0,"2,1");
		b10.makeMove(0,"2,2");

		assertEquals(true, b3.checkWinner(0));
		assertEquals(true, b4.checkWinner(0));
		assertEquals(true, b5.checkWinner(0));
		assertEquals(true, b6.checkWinner(0));
		assertEquals(true, b7.checkWinner(0));
		assertEquals(true, b8.checkWinner(0));
		assertEquals(true, b9.checkWinner(0));
		assertEquals(true, b10.checkWinner(0));
		
	}

	@Test
	public void testWinnerP2() {
		Board b31 = new Board();

		b31.makeMove(1,"0,0");
		b31.makeMove(1,"1,1");
		b31.makeMove(1,"2,2");



		b31.makeMove(1,"0,0");
		b31.makeMove(1,"1,1");
		b31.makeMove(1,"2,2");

		
	
		Board b41 = new Board();

		b41.makeMove(1,"0,2");		
		b41.makeMove(1,"1,1");
		b41.makeMove(1,"2,0");

		

		Board b51 = new Board();

		b51.makeMove(1,"0,0");		
		b51.makeMove(1,"1,0");
		b51.makeMove(1,"2,0");

		

		Board b61 = new Board();

		b61.makeMove(1,"0,1");		
		b61.makeMove(1,"1,1");
		b61.makeMove(1,"2,1");

		
	
		Board b71 = new Board();

		b71.makeMove(1,"0,2");		
		b71.makeMove(1,"1,2");
		b71.makeMove(1,"2,2");

		
		
		Board b81 = new Board();

		b81.makeMove(1,"0,0");		
		b81.makeMove(1,"0,1");
		b81.makeMove(1,"0,2");

		

		Board b91 = new Board();

		b91.makeMove(1,"1,0");		
		b91.makeMove(1,"1,1");
		b91.makeMove(1,"1,2");

		

		Board b101 = new Board();

		b101.makeMove(1,"2,0");		
		b101.makeMove(1,"2,1");
		b101.makeMove(1,"2,2");

		

		assertEquals(true, b31.checkWinner(1));
		assertEquals(true, b41.checkWinner(1));
		assertEquals(true, b51.checkWinner(1));
		assertEquals(true, b61.checkWinner(1));
		assertEquals(true, b71.checkWinner(1));
		assertEquals(true, b81.checkWinner(1));
		assertEquals(true, b91.checkWinner(1));
		assertEquals(true, b101.checkWinner(1));
		
	}

	@Test
	public void drawTest()
	{
		Board bdraw = new Board();

		bdraw.makeMove(0,"0,0");
		bdraw.makeMove(1,"0,1");
		bdraw.makeMove(0,"0,2");
		bdraw.makeMove(1,"1,0");
		bdraw.makeMove(0,"1,2");
		bdraw.makeMove(1,"2,2");
		bdraw.makeMove(0,"2,0");
		bdraw.makeMove(1,"1,1");
		bdraw.makeMove(0,"2,1");

		assertEquals(false,bdraw.checkWinner(0));
		assertEquals(false,bdraw.checkWinner(1));
		assertEquals(true,bdraw.checkDraw(0));
	}

	@Test
	public void maxTurnsWinner()
	{
		Board bturnswin = new Board();

		bturnswin.makeMove(0,"0,0");
		bturnswin.makeMove(1,"0,1");
		bturnswin.makeMove(0,"0,2");
		bturnswin.makeMove(1,"1,0");
		bturnswin.makeMove(0,"1,1");
		bturnswin.makeMove(1,"1,2");
		bturnswin.makeMove(0,"2,1");
		bturnswin.makeMove(1,"2,2");
		bturnswin.makeMove(0,"2,0");

		assertEquals(false,bturnswin.checkDraw(0));
		assertEquals(true,bturnswin.checkWinner(0));
		assertEquals(false,bturnswin.checkWinner(1));
	}
	
}	