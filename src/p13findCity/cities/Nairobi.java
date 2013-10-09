package p13findCity.cities;

import p13findCity.City;

public class Nairobi implements City {
    @Override
    public String getCountry() {
        return "Kenya";
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
