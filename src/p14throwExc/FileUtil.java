package p14throwExc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nik
 */
public class FileUtil {
  public static List<String> readLines(File file) {
    List<String> lines = new ArrayList<String>();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(file));
      try {
        String line;
        while ((line = reader.readLine()) != null) {
          lines.add(line);
        }
      }
      finally {
        reader.close();
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }
}
