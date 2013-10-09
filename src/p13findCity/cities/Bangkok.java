package p13findCity.cities;

import p13findCity.City;

public class Bangkok implements City {
    @Override
    public String getCountry() {
        return "Thailand";
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
