package p13findCity.cities;

import p13findCity.City;

public class UlanBator implements City {
    @Override
    public String getCountry() {
        return "Mongolia";
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
