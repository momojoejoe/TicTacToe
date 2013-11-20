package muffinbandits.ru.tictactoe;

/**
 * Created by: arni11, bjarnthor12, sigruns12, sindris12, sindri12, theodor11 & thordurt12
 * Copyright (c) 2013
 * Project: TicTacToe
 * Package: muffinbandits.ru.tictactoe
 * Date: 19/11/13
 */

/**
 * The player.
 */
public class Players {

	/**
	 * Default name of the player.
	 */
	private String name = "Player";
	/**
	 * Default id of player.
	 */
	private int id = -1;

	/**
	 * Returns the name of the player.
	 * @return name.
	 */
	public  String getName() {
		return name;
	}

	/**
	 * Returns the player id.
	 * @return id.
	 */
	public int getPlayerId() {
		return id;
	}

	/**
	 * Sets the name of the player.
	 * @param pName the player name.
	 */
	public void setName(String pName) {
		name = pName;
	}

	/**
	 * Sets the player id.
	 * @param pId the id of the player.
	 */
	public void setPlayerId(int pId) {
		id = pId;
	}
}