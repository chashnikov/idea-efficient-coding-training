package p13findCity.cities;

import p13findCity.City;

public class KuwaitCity implements City {
    @Override
    public String getCountry() {
        return "Kuwait";
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
