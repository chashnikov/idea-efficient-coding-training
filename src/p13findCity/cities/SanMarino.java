package p13findCity.cities;

import p13findCity.City;

public class SanMarino implements City {
    @Override
    public String getCountry() {
        return "San Marino";
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
