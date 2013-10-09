package p13findCity.cities;

import p13findCity.City;

public class PortoNovo implements City {
    @Override
    public String getCountry() {
        return "Benin";
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
