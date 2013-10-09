package p13findCity.cities;

import p13findCity.City;

public class Islamabad implements City {
    @Override
    public String getCountry() {
        return "Pakistan";
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
