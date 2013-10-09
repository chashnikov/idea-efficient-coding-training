package p13findCity.cities;

import p13findCity.City;

public class Bishkek implements City {
    @Override
    public String getCountry() {
        return "Kyrgyzstan";
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
