package p13findCity.cities;

import p13findCity.City;

public class PortauPrince implements City {
    @Override
    public String getCountry() {
        return "Haiti";
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
