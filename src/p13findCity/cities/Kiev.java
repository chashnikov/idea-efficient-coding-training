package p13findCity.cities;

import p13findCity.City;

public class Kiev implements City {
    @Override
    public String getCountry() {
        return "Ukraine";
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
