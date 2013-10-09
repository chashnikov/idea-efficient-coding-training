package p13findCity.cities;

import p13findCity.City;

public class Astana implements City {
    @Override
    public String getCountry() {
        return "Kazakhstan";
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
