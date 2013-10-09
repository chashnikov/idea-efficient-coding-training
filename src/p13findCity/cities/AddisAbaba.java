package p13findCity.cities;

import p13findCity.City;

public class AddisAbaba implements City {
    @Override
    public String getCountry() {
        return "Ethiopia";
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
