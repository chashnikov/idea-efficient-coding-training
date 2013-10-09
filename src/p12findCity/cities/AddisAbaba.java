package p12findCity.cities;

import p12findCity.City;

public class AddisAbaba implements City {
    @Override
    public String getCountry() {
        return "Ethiopia";
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
