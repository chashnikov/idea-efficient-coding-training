package p13findCity.cities;

import p13findCity.City;

public class Kingstown implements City {
    @Override
    public String getCountry() {
        return "Saint Vincent and the Grenadines";
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
