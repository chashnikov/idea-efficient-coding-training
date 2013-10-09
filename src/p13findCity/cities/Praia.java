package p13findCity.cities;

import p13findCity.City;

public class Praia implements City {
    @Override
    public String getCountry() {
        return "Cape Verde";
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
