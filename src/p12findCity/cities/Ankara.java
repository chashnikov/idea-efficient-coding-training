package p12findCity.cities;

import p12findCity.City;

public class Ankara implements City {
    @Override
    public String getCountry() {
        return "Turkey";
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
