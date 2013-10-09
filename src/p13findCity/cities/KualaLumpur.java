package p13findCity.cities;

import p13findCity.City;

public class KualaLumpur implements City {
    @Override
    public String getCountry() {
        return "Malaysia";
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
