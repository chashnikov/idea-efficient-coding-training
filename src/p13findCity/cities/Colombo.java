package p13findCity.cities;

import p13findCity.City;

public class Colombo implements City {
    @Override
    public String getCountry() {
        return "Sri Lanka";
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
