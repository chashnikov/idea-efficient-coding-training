package p13findCity.cities;

import p13findCity.City;

public class LaPaz implements City {
    @Override
    public String getCountry() {
        return "Bolivia";
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
