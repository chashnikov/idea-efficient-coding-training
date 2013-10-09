package p13findCity.cities;

import p13findCity.City;

public class Manama implements City {
    @Override
    public String getCountry() {
        return "Bahrain";
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
