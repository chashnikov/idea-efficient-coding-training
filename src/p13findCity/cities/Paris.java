package p13findCity.cities;

import p13findCity.City;

public class Paris implements City {
    @Override
    public String getCountry() {
        return "France";
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
