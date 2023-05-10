package dao.entities;

public class LanguageGame {

    private int gameId;
    private String acronym;

    public LanguageGame(int gameId, String acronym) {
        this.gameId = gameId;
        this.acronym = acronym;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }
}
