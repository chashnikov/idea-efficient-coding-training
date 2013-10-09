package p13findCity.cities;

import p13findCity.City;

public class Bamako implements City {
    @Override
    public String getCountry() {
        return "Mali";
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
