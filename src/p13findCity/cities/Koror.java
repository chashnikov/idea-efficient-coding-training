package p13findCity.cities;

import p13findCity.City;

public class Koror implements City {
    @Override
    public String getCountry() {
        return "Palau";
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
