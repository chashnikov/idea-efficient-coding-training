package p13findCity.cities;

import p13findCity.City;

public class Singapore implements City {
    @Override
    public String getCountry() {
        return "Singapore";
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
