package p13findCity.cities;

import p13findCity.City;

public class Asmara implements City {
    @Override
    public String getCountry() {
        return "Eritrea";
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
