package p13findCity.cities;

import p13findCity.City;

public class Honiara implements City {
    @Override
    public String getCountry() {
        return "Solomon Islands";
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
