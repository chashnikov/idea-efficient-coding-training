package p2listAndArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nik
 */
public class Conversion {
  public void print(List<String> strings, Integer[] integers) {
    printList();
    printArray();
  }

  private void printList(List<Integer> list) {
    for (Integer i : list) {
      System.out.println(i);
    }
  }

  private void printArray(String[] array) {
    for (String s : array) {
      System.out.println(s);
    }
  }
}
