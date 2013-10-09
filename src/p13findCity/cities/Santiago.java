package p13findCity.cities;

import p13findCity.City;

public class Santiago implements City {
    @Override
    public String getCountry() {
        return "Chile";
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
