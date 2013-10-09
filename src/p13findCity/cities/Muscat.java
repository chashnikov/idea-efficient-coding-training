package p13findCity.cities;

import p13findCity.City;

public class Muscat implements City {
    @Override
    public String getCountry() {
        return "Oman";
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
