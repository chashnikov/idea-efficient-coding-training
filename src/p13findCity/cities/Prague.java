package p13findCity.cities;

import p13findCity.City;

public class Prague implements City {
    @Override
    public String getCountry() {
        return "Czech Republic";
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
