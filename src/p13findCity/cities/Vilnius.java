package p13findCity.cities;

import p13findCity.City;

public class Vilnius implements City {
    @Override
    public String getCountry() {
        return "Lithuania";
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
