package p13findCity.cities;

import p13findCity.City;

public class Caracas implements City {
    @Override
    public String getCountry() {
        return "Venezuela";
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
