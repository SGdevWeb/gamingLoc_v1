package dao.entities;

public class TagGame {
	private int gameId;
	private int tagId;
	
	
	public TagGame(int gameId, int tagId) {
		super();
		this.gameId = gameId;
		this.tagId = tagId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

}
