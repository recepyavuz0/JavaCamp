package entities;

import abstracts.Entity;

public class Game implements Entity{
	private int id;
	private String gameName;
	private float gamePrice;
	
	public Game(int id, String gameName, float gamePrice) {
		this.id = id;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public float getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(float gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	
}
