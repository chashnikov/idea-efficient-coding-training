package p13findCity.cities;

import p13findCity.City;

public class Fongafale implements City {
    @Override
    public String getCountry() {
        return "Tuvalu";
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
