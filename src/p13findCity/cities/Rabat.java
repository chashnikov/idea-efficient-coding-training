package p13findCity.cities;

import p13findCity.City;

public class Rabat implements City {
    @Override
    public String getCountry() {
        return "Morocco";
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
