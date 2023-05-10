package dao.entities;

public class Address {

    private int addressId;
    private String streetAddress;
    private String complementaryAddress;
    private City city;

    public Address(String streetAddress, String complementaryAddress, City city) {
        this.streetAddress = streetAddress;
        this.complementaryAddress = complementaryAddress;
        this.city = city;
    }
    //region GETTER/SETTER
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getComplementaryAddress() {
        return complementaryAddress;
    }

    public void setComplementaryAddress(String complementaryAddress) {
        this.complementaryAddress = complementaryAddress;
    }
    //endregion
}
