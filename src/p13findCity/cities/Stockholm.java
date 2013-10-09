package p13findCity.cities;

import p13findCity.City;

public class Stockholm implements City {
    @Override
    public String getCountry() {
        return "Sweden";
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
