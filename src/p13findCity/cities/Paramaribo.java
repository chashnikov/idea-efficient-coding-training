package p13findCity.cities;

import p13findCity.City;

public class Paramaribo implements City {
    @Override
    public String getCountry() {
        return "Suriname";
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
