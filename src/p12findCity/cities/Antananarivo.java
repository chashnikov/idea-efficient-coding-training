package p12findCity.cities;

import p12findCity.City;

public class Antananarivo implements City {
    @Override
    public String getCountry() {
        return "Madagascar";
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
