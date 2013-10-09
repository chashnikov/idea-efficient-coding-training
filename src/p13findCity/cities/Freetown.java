package p13findCity.cities;

import p13findCity.City;

public class Freetown implements City {
    @Override
    public String getCountry() {
        return "Sierra Leone";
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
