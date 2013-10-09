package p13findCity.cities;

import p13findCity.City;

public class Castries implements City {
    @Override
    public String getCountry() {
        return "Saint Lucia";
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
