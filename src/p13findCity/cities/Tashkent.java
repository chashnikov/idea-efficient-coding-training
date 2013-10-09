package p13findCity.cities;

import p13findCity.City;

public class Tashkent implements City {
    @Override
    public String getCountry() {
        return "Uzbekistan";
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
