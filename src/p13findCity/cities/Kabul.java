package p13findCity.cities;

import p13findCity.City;

public class Kabul implements City {
    @Override
    public String getCountry() {
        return "Afghanistan";
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
