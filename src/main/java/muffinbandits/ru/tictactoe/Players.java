package muffinbandits.ru.tictactoe;

public class Players {

	private String name = "Player";
	private int id = -1;

	public String greet() {
		return "Hello sir";
	}

	public  String getName() {
		return name;
	}

	public int getPlayerId() {
		return id;
	}

	public void setName(String pName) {
		name = pName;
	}

	public void setPlayerId(int pId) {
		id = pId;
	}
}