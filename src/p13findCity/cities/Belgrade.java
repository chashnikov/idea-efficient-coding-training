package p13findCity.cities;

import p13findCity.City;

public class Belgrade implements City {
    @Override
    public String getCountry() {
        return "Serbia";
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
