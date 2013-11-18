package muffinbandits.ru.tictactoe;

public class Board {

	// public static int X = 0;
	// public static int Y = 0;


	public static int getXCord(String cellId) {

		String[] a = cellId.split(",");

		int x = Integer.parseInt(a[0]);
		// Y = Integer.parseInt(a[1]);
		if (!isLegal(x)) {
			return -1;
		}

		return x;
	}

		public static int getYCord(String cellId) {

		String[] a = cellId.split(",");

		int y = Integer.parseInt(a[1]);
		// Y = Integer.parseInt(a[1]);
		if (!isLegal(y)) {
			return -1;
		}

		return y;
	}

	public static boolean isLegal(int x) {

		if (x > 2 || x < 0) {
			return false;
		} 
		return true;
	}

}