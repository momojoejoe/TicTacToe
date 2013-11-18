package muffinbandits.ru.tictactoe;

public class Board {


	public static boolean isLegal(int x, int y) {
		if (x > 2 || x < 0) {
			return false;
		} else if (y > 2 || y < 0){
			return false;
		}
		return true;
	}

}