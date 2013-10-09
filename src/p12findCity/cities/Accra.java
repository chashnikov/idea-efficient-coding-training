package p12findCity.cities;

import p12findCity.City;

public class Accra implements City {
    @Override
    public String getCountry() {
        return "Ghana";
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
