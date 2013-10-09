package p12findCity.cities;

import p12findCity.City;

public class Apia implements City {
    @Override
    public String getCountry() {
        return "Samoa";
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
