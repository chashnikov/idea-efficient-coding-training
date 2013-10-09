package p13findCity.cities;

import p13findCity.City;

public class SaintDenis implements City {
    @Override
    public String getCountry() {
        return "Réunion";
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
