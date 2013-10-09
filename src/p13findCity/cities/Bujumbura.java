package p13findCity.cities;

import p13findCity.City;

public class Bujumbura implements City {
    @Override
    public String getCountry() {
        return "Burundi";
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
