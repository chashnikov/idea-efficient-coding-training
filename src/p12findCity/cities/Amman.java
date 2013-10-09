package p12findCity.cities;

import p12findCity.City;

public class Amman implements City {
    @Override
    public String getCountry() {
        return "Jordan";
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
