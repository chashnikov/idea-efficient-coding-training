package p13findCity.cities;

import p13findCity.City;

public class PanamaCity implements City {
    @Override
    public String getCountry() {
        return "Panama";
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