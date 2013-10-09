package p13findCity.cities;

import p13findCity.City;

public class Khartoum implements City {
    @Override
    public String getCountry() {
        return "Sudan";
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
