package p13findCity.cities;

import p13findCity.City;

public class SanJose implements City {
    @Override
    public String getCountry() {
        return "Costa Rica";
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
