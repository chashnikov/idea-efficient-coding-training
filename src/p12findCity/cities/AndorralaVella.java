package p12findCity.cities;

import p12findCity.City;

public class AndorralaVella implements City {
    @Override
    public String getCountry() {
        return "Andorra";
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
