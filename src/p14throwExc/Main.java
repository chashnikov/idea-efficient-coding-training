package p14throwExc;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author nik
 */
public class Main {
  public static void main(String[] args) {
    File dir = new File(args[0]);
    File listsDir = new File(args[1]);
    Set<String> fired = loadFired(listsDir);
    Set<String> dead = loadDead(listsDir);
    List <Person > persons = new PersonDirectory(dir).getPersons();
    for (Person person : persons) {
      boolean isFired = fired.contains(person.getName());
      boolean isDead = dead.contains(person.getName());
      System.out.println(person.getName() + "," + person.getAddress() + (isFired ? ", fired" : "") + (isDead ? ", dead" : ""));
    }
  }

  private static Set<String> loadFired(File dir) {
    return new HashSet<String>(FileUtil.readLines(new File(dir, "fired.txt")));
  }

  private static Set<String> loadDead(File dir) {
    return new HashSet<String>(FileUtil.readLines(new File(dir, "dead.txt")));
  }


}
