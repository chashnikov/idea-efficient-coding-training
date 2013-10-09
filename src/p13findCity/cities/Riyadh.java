package p13findCity.cities;

import p13findCity.City;

public class Riyadh implements City {
    @Override
    public String getCountry() {
        return "Saudi Arabia";
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
