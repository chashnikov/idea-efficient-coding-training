package p13findCity.cities;

import p13findCity.City;

public class Djibouti implements City {
    @Override
    public String getCountry() {
        return "Djibouti";
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
