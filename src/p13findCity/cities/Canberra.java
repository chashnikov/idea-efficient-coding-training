package p13findCity.cities;

import p13findCity.City;

public class Canberra implements City {
    @Override
    public String getCountry() {
        return "Australia";
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
