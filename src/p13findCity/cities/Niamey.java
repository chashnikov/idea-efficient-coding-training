package p13findCity.cities;

import p13findCity.City;

public class Niamey implements City {
    @Override
    public String getCountry() {
        return "Niger";
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
