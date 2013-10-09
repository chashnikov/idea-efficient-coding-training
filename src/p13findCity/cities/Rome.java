package p13findCity.cities;

import p13findCity.City;

public class Rome implements City {
    @Override
    public String getCountry() {
        return "Italy";
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
