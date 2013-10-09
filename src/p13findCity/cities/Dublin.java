package p13findCity.cities;

import p13findCity.City;

public class Dublin implements City {
    @Override
    public String getCountry() {
        return "Ireland";
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
