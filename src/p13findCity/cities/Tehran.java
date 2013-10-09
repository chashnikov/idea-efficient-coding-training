package p13findCity.cities;

import p13findCity.City;

public class Tehran implements City {
    @Override
    public String getCountry() {
        return "Iran";
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
