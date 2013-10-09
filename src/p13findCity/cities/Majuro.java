package p13findCity.cities;

import p13findCity.City;

public class Majuro implements City {
    @Override
    public String getCountry() {
        return "Marshall Islands";
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
