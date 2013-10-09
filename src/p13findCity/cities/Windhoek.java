package p13findCity.cities;

import p13findCity.City;

public class Windhoek implements City {
    @Override
    public String getCountry() {
        return "Namibia";
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
