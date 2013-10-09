package p13findCity.cities;

import p13findCity.City;

public class Nassau implements City {
    @Override
    public String getCountry() {
        return "Bahamas";
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
