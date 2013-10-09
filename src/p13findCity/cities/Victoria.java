package p13findCity.cities;

import p13findCity.City;

public class Victoria implements City {
    @Override
    public String getCountry() {
        return "Seychelles";
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
