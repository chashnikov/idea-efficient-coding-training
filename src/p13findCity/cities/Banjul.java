package p13findCity.cities;

import p13findCity.City;

public class Banjul implements City {
    @Override
    public String getCountry() {
        return "Gambia, The";
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
