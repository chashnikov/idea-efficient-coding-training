package p13findCity.cities;

import p13findCity.City;

public class Dhaka implements City {
    @Override
    public String getCountry() {
        return "Bangladesh";
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
