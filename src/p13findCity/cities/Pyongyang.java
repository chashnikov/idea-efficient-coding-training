package p13findCity.cities;

import p13findCity.City;

public class Pyongyang implements City {
    @Override
    public String getCountry() {
        return "Korea, North";
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
