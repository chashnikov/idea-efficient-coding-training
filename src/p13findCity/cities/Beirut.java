package p13findCity.cities;

import p13findCity.City;

public class Beirut implements City {
    @Override
    public String getCountry() {
        return "Lebanon";
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
