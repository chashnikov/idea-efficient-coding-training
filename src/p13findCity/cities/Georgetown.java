package p13findCity.cities;

import p13findCity.City;

public class Georgetown implements City {
    @Override
    public String getCountry() {
        return "Guyana";
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
