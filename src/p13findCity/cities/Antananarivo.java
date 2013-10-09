package p13findCity.cities;

import p13findCity.City;

public class Antananarivo implements City {
    @Override
    public String getCountry() {
        return "Madagascar";
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
