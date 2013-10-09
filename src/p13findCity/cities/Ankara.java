package p13findCity.cities;

import p13findCity.City;

public class Ankara implements City {
    @Override
    public String getCountry() {
        return "Turkey";
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
