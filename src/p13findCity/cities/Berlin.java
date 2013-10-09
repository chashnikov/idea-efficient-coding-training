package p13findCity.cities;

import p13findCity.City;

public class Berlin implements City {
    @Override
    public String getCountry() {
        return "Germany";
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
