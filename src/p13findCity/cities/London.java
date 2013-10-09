package p13findCity.cities;

import p13findCity.City;

public class London implements City {
    @Override
    public String getCountry() {
        return "United Kingdom";
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
