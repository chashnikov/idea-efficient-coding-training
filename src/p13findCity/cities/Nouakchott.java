package p13findCity.cities;

import p13findCity.City;

public class Nouakchott implements City {
    @Override
    public String getCountry() {
        return "Mauritania";
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
