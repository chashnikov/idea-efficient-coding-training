package p13findCity.cities;

import p13findCity.City;

public class Beijing implements City {
    @Override
    public String getCountry() {
        return "China";
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
