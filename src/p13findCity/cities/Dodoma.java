package p13findCity.cities;

import p13findCity.City;

public class Dodoma implements City {
    @Override
    public String getCountry() {
        return "Tanzania";
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
