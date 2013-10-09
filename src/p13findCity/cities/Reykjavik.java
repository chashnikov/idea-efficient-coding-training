package p13findCity.cities;

import p13findCity.City;

public class Reykjavik implements City {
    @Override
    public String getCountry() {
        return "Iceland";
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
