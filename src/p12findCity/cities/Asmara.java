package p12findCity.cities;

import p12findCity.City;

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
