package p13findCity.cities;

import p13findCity.City;

public class Belmopan implements City {
    @Override
    public String getCountry() {
        return "Belize";
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
