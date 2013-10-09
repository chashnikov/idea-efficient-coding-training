package p13findCity.cities;

import p13findCity.City;

public class PortofSpain implements City {
    @Override
    public String getCountry() {
        return "Trinidad and Tobago";
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
