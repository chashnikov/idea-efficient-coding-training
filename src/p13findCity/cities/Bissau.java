package p13findCity.cities;

import p13findCity.City;

public class Bissau implements City {
    @Override
    public String getCountry() {
        return "Guinea-Bissau";
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
