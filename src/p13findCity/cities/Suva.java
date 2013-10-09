package p13findCity.cities;

import p13findCity.City;

public class Suva implements City {
    @Override
    public String getCountry() {
        return "Fiji";
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
