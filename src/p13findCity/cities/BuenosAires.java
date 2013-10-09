package p13findCity.cities;

import p13findCity.City;

public class BuenosAires implements City {
    @Override
    public String getCountry() {
        return "Argentina";
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
