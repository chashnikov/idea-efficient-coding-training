package p14throwExc;

import java.io.File;
import java.util.List;

/**
 * @author nik
 */
public class Employee {
  private final String name;
  private final String address;

  public Employee(File file) {
    List<String> lines = FileUtil.readLines(file);
    name = lines.get(0);
    address = lines.get(1);
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }
}
