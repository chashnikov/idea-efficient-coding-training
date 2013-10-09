package p13findCity.cities;

import p13findCity.City;

public class Malabo implements City {
    @Override
    public String getCountry() {
        return "Equatorial Guinea";
    }

    @Override
    public boolean isCapital() {
        return true;
    }

    @Override
    public boolean isThePerfectPlace() {
        return false;
    }
}
