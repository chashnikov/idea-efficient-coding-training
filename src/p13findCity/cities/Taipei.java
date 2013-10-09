package p13findCity.cities;

import p13findCity.City;

public class Taipei implements City {
    @Override
    public String getCountry() {
        return "Taiwan";
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
