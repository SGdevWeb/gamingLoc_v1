package dao.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rental {
    private int rentalId;
    private LocalDateTime rentalDate;
    private LocalDateTime rentalPrice;

    public Rental(int rentalId, LocalDateTime rentalDate, LocalDateTime rentalPrice) {
        this.rentalId = rentalId;
        this.rentalDate = rentalDate;
        this.rentalPrice = rentalPrice;
    }

    //region GETTER/SETTER
    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public LocalDateTime getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDateTime rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDateTime getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(LocalDateTime rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
    //endregion
}