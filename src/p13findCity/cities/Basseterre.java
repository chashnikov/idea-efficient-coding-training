package p13findCity.cities;

import p13findCity.City;

public class Basseterre implements City {
    @Override
    public String getCountry() {
        return "Saint Kitts and Nevis";
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
