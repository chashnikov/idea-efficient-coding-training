package p13findCity.cities;

import p13findCity.City;

public class ElAaiun implements City {
    @Override
    public String getCountry() {
        return "Western Sahara";
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
