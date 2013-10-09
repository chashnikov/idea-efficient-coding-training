package p13findCity.cities;

import p13findCity.City;

public class Bridgetown implements City {
    @Override
    public String getCountry() {
        return "Barbados";
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
