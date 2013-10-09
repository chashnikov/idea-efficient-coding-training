package p13findCity.cities;

import p13findCity.City;

public class Lusaka implements City {
    @Override
    public String getCountry() {
        return "Zambia";
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
