package p13findCity.cities;

import p13findCity.City;

public class Helsinki implements City {
    @Override
    public String getCountry() {
        return "Finland";
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
