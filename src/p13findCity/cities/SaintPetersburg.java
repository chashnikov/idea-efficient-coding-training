package p13findCity.cities;

import p13findCity.City;

public class SaintPetersburg implements City {
    @Override
    public String getCountry() {
        return "Russia";
    }

    @Override
    public boolean isCapital() {
        return false;
    }

    @Override
    public boolean isThePerfectPlace() {
        return false;
    }
}
