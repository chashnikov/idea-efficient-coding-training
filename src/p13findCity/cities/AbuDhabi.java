package p13findCity.cities;

import p13findCity.City;

public class AbuDhabi implements City {
    @Override
    public String getCountry() {
        return "United Arab Emirates";
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
