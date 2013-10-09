package p13findCity.cities;

import p13findCity.City;

public class Tunis implements City {
    @Override
    public String getCountry() {
        return "Tunisia";
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
