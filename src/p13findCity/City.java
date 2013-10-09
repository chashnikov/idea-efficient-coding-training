package p13findCity;

/**
 * @author nik
 */
public interface City {
  String getCountry();
  boolean isCapital();
  boolean isThePerfectPlace();
}

class X {
  void m(City c) {
    boolean capital = c.isCapital();
  }
}