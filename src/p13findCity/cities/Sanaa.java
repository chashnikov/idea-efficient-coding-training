package p13findCity.cities;

import p13findCity.City;

public class Sanaa implements City {
    @Override
    public String getCountry() {
        return "Yemen";
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
