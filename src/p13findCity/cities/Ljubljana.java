package p13findCity.cities;

import p13findCity.City;

public class Ljubljana implements City {
    @Override
    public String getCountry() {
        return "Slovenia";
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
