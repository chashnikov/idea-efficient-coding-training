package p13findCity.cities;

import p13findCity.City;

public class Ottawa implements City {
    @Override
    public String getCountry() {
        return "Canada";
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
