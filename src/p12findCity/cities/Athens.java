package p12findCity.cities;

import p12findCity.City;

public class Athens implements City {
    @Override
    public String getCountry() {
        return "Greece";
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
