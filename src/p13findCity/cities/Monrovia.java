package p13findCity.cities;

import p13findCity.City;

public class Monrovia implements City {
    @Override
    public String getCountry() {
        return "Liberia";
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
