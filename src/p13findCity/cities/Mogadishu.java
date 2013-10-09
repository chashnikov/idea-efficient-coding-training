package p13findCity.cities;

import p13findCity.City;

public class Mogadishu implements City {
    @Override
    public String getCountry() {
        return "Somalia";
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
