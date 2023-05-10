package dao.entities;

public class City {

    private int cityId;
    private String postalCode;
    private String countryName;
    private String cityName;

    public City(int cityId, String postalCode, String countryName, String cityName) {
        this.cityId = cityId;
        this.postalCode = postalCode;
        this.countryName = countryName;
        this.cityName = cityName;
    }

    //region GETTER/SETTER
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    //endregion
}
