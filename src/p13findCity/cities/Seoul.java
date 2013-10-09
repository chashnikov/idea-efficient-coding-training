package p13findCity.cities;

import p13findCity.City;

public class Seoul implements City {
    @Override
    public String getCountry() {
        return "Korea, South";
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
