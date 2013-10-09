package p13findCity.cities;

import p13findCity.City;

public class Managua implements City {
    @Override
    public String getCountry() {
        return "Nicaragua";
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
