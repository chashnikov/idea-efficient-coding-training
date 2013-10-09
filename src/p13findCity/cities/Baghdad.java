package p13findCity.cities;

import p13findCity.City;

public class Baghdad implements City {
    @Override
    public String getCountry() {
        return "Iraq";
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
