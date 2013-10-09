package p12findCity.cities;

import p12findCity.City;

public class Amsterdam implements City {
    @Override
    public String getCountry() {
        return "Netherlands";
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
