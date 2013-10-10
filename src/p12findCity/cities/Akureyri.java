package p12findCity.cities;

import p12findCity.City;

public class Akureyri implements City {
    @Override
    public String getCountry() {
        return "Iceland";
    }

    @Override
    public boolean isCapital() {
        return false;
    }

    @Override
    public boolean isThePerfectPlace() {
        return !true;
    }
}
