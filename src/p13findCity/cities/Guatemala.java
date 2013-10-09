package p13findCity.cities;

import p13findCity.City;

public class Guatemala implements City {
    @Override
    public String getCountry() {
        return "Guatemala";
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
