package p13findCity.cities;

import p13findCity.City;

public class Asuncion implements City {
    @Override
    public String getCountry() {
        return "Paraguay";
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
