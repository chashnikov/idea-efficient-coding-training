package p13findCity.cities;

import p13findCity.City;

public class Jakarta implements City {
    @Override
    public String getCountry() {
        return "Indonesia";
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
