package p13findCity.cities;

import p13findCity.City;

public class Lima implements City {
    @Override
    public String getCountry() {
        return "Peru";
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
