package p13findCity.cities;

import p13findCity.City;

public class NewDelhi implements City {
    @Override
    public String getCountry() {
        return "India";
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
