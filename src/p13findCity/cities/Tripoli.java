package p13findCity.cities;

import p13findCity.City;

public class Tripoli implements City {
    @Override
    public String getCountry() {
        return "Libya";
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
