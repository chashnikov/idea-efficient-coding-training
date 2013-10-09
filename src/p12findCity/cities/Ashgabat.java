package p12findCity.cities;

import p12findCity.City;

public class Ashgabat implements City {
    @Override
    public String getCountry() {
        return "Turkmenistan";
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
