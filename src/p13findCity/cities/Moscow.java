package p13findCity.cities;

import p13findCity.City;

public class Moscow implements City {
    @Override
    public String getCountry() {
        return "Russia";
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
