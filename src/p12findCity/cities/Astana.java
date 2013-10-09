package p12findCity.cities;

import p12findCity.City;

public class Astana implements City {
    @Override
    public String getCountry() {
        return "Kazakhstan";
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
