package p13findCity.cities;

import p13findCity.City;

public class StJohns implements City {
    @Override
    public String getCountry() {
        return "Antigua and Barbuda";
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
