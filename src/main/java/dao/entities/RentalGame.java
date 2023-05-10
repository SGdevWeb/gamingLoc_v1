package dao.entities;

public class RentalGame {
    private Game game;
    private Rental rental;
    private float rentalPrice;

    public RentalGame(Game game, Rental rental, float rentalPrice) {
        this.game = game;
        this.rental = rental;
        this.rentalPrice = rentalPrice;
    }

    //region GETTER/SETTER
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public float getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(float rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
    //endregion
}
