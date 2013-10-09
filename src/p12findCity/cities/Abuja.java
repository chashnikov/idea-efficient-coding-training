package p12findCity.cities;

import p12findCity.City;

public class Abuja implements City {
    @Override
    public String getCountry() {
        return "Nigeria";
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
