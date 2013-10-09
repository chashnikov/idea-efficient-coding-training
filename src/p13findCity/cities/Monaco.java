package p13findCity.cities;

import p13findCity.City;

public class Monaco implements City {
    @Override
    public String getCountry() {
        return "Monaco";
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
