package p14throwExc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nik
 */
public class PersonDirectory {
  private final List<Person> persons;

  public PersonDirectory(File dir) {
    persons = new ArrayList<Person>();
    for (File file : dir.listFiles()) {
      persons.add(new Person(file));
    }
  }

  public List<Person> getPersons() {
    return persons;
  }
}
