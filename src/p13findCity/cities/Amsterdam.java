package p13findCity.cities;

import p13findCity.City;

public class Amsterdam implements City {
    @Override
    public String getCountry() {
        return "Netherlands";
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
