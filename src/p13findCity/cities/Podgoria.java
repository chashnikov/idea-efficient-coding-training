package p13findCity.cities;

import p13findCity.City;

public class Podgoria implements City {
    @Override
    public String getCountry() {
        return "Montenegro";
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
