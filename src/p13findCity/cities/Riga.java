package p13findCity.cities;

import p13findCity.City;

public class Riga implements City {
    @Override
    public String getCountry() {
        return "Latvia";
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
