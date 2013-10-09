package p13findCity.cities;

import p13findCity.City;

public class Baku implements City {
    @Override
    public String getCountry() {
        return "Azerbaijan";
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
