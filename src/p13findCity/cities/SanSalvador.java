package p13findCity.cities;

import p13findCity.City;

public class SanSalvador implements City {
    @Override
    public String getCountry() {
        return "El Salvador";
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
