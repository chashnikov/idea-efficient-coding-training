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
    List<Employee> employees = new EmployeeDirectory(dir).getEmployees();
    for (Employee employee : employees) {
      boolean isFired = fired.contains(employee.getName());
      boolean isDead = dead.contains(employee.getName());
      System.out.println(employee.getName() + "," + employee.getAddress()
                         + (isFired ? ", fired" : "") + (isDead ? ", dead" : ""));
    }
  }

  private static Set<String> loadFired(File dir) {
    return new HashSet<String>(FileUtil.readLines(new File(dir, "fired.txt")));
  }

  private static Set<String> loadDead(File dir) {
    return new HashSet<String>(FileUtil.readLines(new File(dir, "dead.txt")));
  }


}
