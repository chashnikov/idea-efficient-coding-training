package p13findCity.cities;

import p13findCity.City;

public class Dili implements City {
    @Override
    public String getCountry() {
        return "East Timor";
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
