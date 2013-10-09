package p13findCity.cities;

import p13findCity.City;

public class Brussels implements City {
    @Override
    public String getCountry() {
        return "Belgium";
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
