package p13findCity.cities;

import p13findCity.City;

public class Hanoi implements City {
    @Override
    public String getCountry() {
        return "Vietnam";
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
