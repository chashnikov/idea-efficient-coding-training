package p13findCity.cities;

import p13findCity.City;

public class Oslo implements City {
    @Override
    public String getCountry() {
        return "Norway";
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
