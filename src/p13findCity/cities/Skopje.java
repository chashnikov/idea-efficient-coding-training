package p13findCity.cities;

import p13findCity.City;

public class Skopje implements City {
    @Override
    public String getCountry() {
        return "Macedonia";
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
