package p13findCity.cities;

import p13findCity.City;

public class Ashgabat implements City {
    @Override
    public String getCountry() {
        return "Turkmenistan";
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
