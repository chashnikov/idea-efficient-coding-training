package p13findCity.cities;

import p13findCity.City;

public class Athens implements City {
    @Override
    public String getCountry() {
        return "Greece";
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
