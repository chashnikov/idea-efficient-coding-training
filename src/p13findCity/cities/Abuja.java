package p13findCity.cities;

import p13findCity.City;

public class Abuja implements City {
    @Override
    public String getCountry() {
        return "Nigeria";
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
