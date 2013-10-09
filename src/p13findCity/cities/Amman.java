package p13findCity.cities;

import p13findCity.City;

public class Amman implements City {
    @Override
    public String getCountry() {
        return "Jordan";
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
