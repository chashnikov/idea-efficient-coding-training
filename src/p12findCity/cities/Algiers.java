package p12findCity.cities;

import p12findCity.City;

public class Algiers implements City {
    @Override
    public String getCountry() {
        return "Algeria";
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
