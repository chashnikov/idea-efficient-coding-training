package p13findCity.cities;

import p13findCity.City;

public class Valletta implements City {
    @Override
    public String getCountry() {
        return "Malta";
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
