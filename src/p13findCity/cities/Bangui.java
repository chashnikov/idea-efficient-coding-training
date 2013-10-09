package p13findCity.cities;

import p13findCity.City;

public class Bangui implements City {
    @Override
    public String getCountry() {
        return "Central African Republic";
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
