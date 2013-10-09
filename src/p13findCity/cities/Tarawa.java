package p13findCity.cities;

import p13findCity.City;

public class Tarawa implements City {
    @Override
    public String getCountry() {
        return "Kiribati";
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
