package p13findCity.cities;

import p13findCity.City;

public class Vaduz implements City {
    @Override
    public String getCountry() {
        return "Liechtenstein";
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
