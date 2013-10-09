package p1complete;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author nik
 */
public class DoubleSmart {
  public Set<Manufacturer> getManufacturers(List<Phone> phones) {
    //how to collect all manufacturers?
    return
  }
}

interface Phone {
  Manufacturer getManufacturer();
}

interface Manufacturer {
  String getName();
  String getCountry();
}


