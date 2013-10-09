package p13findCity.cities;

import p13findCity.City;

public class PortMoresby implements City {
    @Override
    public String getCountry() {
        return "Papua New Guinea";
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
