package p13findCity.cities;

import p13findCity.City;

public class Wellington implements City {
    @Override
    public String getCountry() {
        return "New Zealand";
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
