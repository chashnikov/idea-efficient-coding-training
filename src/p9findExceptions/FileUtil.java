package p9findExceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author nik
 */
public class FileUtil {
  public static void copyDir(File fromDir, File toDir) throws IOException {
    if (!fromDir.canRead()) {
      throw new IOException("Directory is not readable: " + fromDir);
    }
    File[] files = fromDir.listFiles();
    for (File file : files) {
      if (file.isDirectory()) {
        copyDir(file, new File(toDir, file.getName()));
      }
      else {
        FileOutputStream fos = new FileOutputStream(new File(toDir, file.getName()));
        try {
          FileInputStream fis = new FileInputStream(file);
          try {
            copy(fis, fos);
          }
          finally {
            fis.close();
          }
        }
        finally {
          fos.close();
        }
      }
    }
  }

  public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
    final byte[] buffer = new byte[10 * 1024];
    int read;
    while ((read = inputStream.read(buffer)) >= 0) {
      outputStream.write(buffer, 0, read);
    }
  }

}
