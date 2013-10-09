package p12findCity.cities;

import p12findCity.City;

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
