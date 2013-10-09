package p13findCity.cities;

import p13findCity.City;

public class MexicoCity implements City {
    @Override
    public String getCountry() {
        return "Mexico";
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
