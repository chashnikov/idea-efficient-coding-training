package p13findCity.cities;

import p13findCity.City;

public class Thimphu implements City {
    @Override
    public String getCountry() {
        return "Bhutan";
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
