package p13findCity.cities;

import p13findCity.City;

public class Tokyo implements City {
    @Override
    public String getCountry() {
        return "Japan";
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
