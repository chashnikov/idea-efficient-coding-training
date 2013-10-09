package p13findCity.cities;

import p13findCity.City;

public class Sofia implements City {
    @Override
    public String getCountry() {
        return "Bulgaria";
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
