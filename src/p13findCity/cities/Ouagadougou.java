package p13findCity.cities;

import p13findCity.City;

public class Ouagadougou implements City {
    @Override
    public String getCountry() {
        return "Burkina Faso";
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
