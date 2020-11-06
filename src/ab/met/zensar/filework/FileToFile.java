package ab.met.zensar.filework;

import java.io.*;

public class FileToFile {
  public static void main(String[] args) throws FileNotFoundException {
    //
    String Package = "ab//met//zensar//filework";
    int x = 0;

    FileInputStream src = new FileInputStream(".//src//" + Package + "//src.txt");
    FileOutputStream dest = new FileOutputStream(".//src//" + Package + "//dest.txt");

    try {

      System.out.println("\nFile Opened");

      do {
        x = src.read();
        if (x != -1) dest.write((char) x);
      } while (x != -1);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
