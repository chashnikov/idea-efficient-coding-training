package p13findCity.cities;

import p13findCity.City;

public class YarenDistrict implements City {
    @Override
    public String getCountry() {
        return "Nauru";
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
