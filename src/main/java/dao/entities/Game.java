package dao.entities;

public class Game {
    private int gameId;
    private String gameName;
    private String gameDescr;
    private int stock;
    private float gamePrice;
    private String image;
    private int minPlayer;
    private int maxPlayer;
    private int minAge;

    public Game(int gameId, String gameName, String gameDescr, int stock, float gamePrice, String image, int minPlayer, int maxPlayer, int minAge) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameDescr = gameDescr;
        this.stock = stock;
        this.gamePrice = gamePrice;
        this.image = image;
        this.minPlayer = minPlayer;
        this.maxPlayer = maxPlayer;
        this.minAge = minAge;
    }

    //region GETTER/SETTER
    public int getgameId() {
        return gameId;
    }

    public void setgameId(int gameId) {
        this.gameId = gameId;
    }

    public String getgameName() {
        return gameName;
    }

    public void setgameName(String gameName) {
        this.gameName = gameName;
    }

    public String getgameDescr() {
        return gameDescr;
    }

    public void setgameDescr(String gameDescr) {
        gameDescr = gameDescr;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getgamePrice() {
        return gamePrice;
    }

    public void setgamePrice(float gamePrice) {
        this.gamePrice = gamePrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getminPlayer() {
        return minPlayer;
    }

    public void setminPlayer(int minPlayer) {
        this.minPlayer = minPlayer;
    }

    public int getmaxPlayer() {
        return maxPlayer;
    }

    public void setmaxPlayer(int maxPlayer) {
        this.maxPlayer = maxPlayer;
    }

    public int getminAge() {
        return minAge;
    }

    public void setminAge(int minAge) {
        this.minAge = minAge;
    }

    public String getGameDescr() {
        return gameDescr;
    }

    public void setGameDescr(String gameDescr) {
        this.gameDescr = gameDescr;
    }

    //endregion


}
