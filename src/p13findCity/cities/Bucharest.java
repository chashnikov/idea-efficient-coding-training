package p13findCity.cities;

import p13findCity.City;

public class Bucharest implements City {
    @Override
    public String getCountry() {
        return "Romania";
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
