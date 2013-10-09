package p13findCity.cities;

import p13findCity.City;

public class SantoDomingo implements City {
    @Override
    public String getCountry() {
        return "Dominican Republic";
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
