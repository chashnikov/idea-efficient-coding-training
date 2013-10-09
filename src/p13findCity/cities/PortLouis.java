package p13findCity.cities;

import p13findCity.City;

public class PortLouis implements City {
    @Override
    public String getCountry() {
        return "Mauritius";
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
