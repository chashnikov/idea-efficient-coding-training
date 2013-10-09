package p13findCity.cities;

import p13findCity.City;

public class Lome implements City {
    @Override
    public String getCountry() {
        return "Togo";
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
