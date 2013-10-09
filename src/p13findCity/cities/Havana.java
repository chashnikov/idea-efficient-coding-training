package p13findCity.cities;

import p13findCity.City;

public class Havana implements City {
    @Override
    public String getCountry() {
        return "Cuba";
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
