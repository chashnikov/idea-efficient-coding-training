package p14throwExc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nik
 */
public class EmployeeDirectory {
  private final List<Employee> employees;

  public EmployeeDirectory(File dir) {
    employees = new ArrayList<Employee>();
    for (File file : dir.listFiles()) {
      employees.add(new Employee(file));
    }
  }

  public List<Employee> getEmployees() {
    return employees;
  }
}
