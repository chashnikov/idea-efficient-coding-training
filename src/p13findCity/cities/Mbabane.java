package p13findCity.cities;

import p13findCity.City;

public class Mbabane implements City {
    @Override
    public String getCountry() {
        return "Swaziland";
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
