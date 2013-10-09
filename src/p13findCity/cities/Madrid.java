package p13findCity.cities;

import p13findCity.City;

public class Madrid implements City {
    @Override
    public String getCountry() {
        return "Spain";
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
