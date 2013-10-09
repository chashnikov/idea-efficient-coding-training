package p13findCity.cities;

import p13findCity.City;

public class PortVila implements City {
    @Override
    public String getCountry() {
        return "Vanuatu";
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
