package p13findCity.cities;

import p13findCity.City;

public class Kishinev implements City {
    @Override
    public String getCountry() {
        return "Moldova";
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
