package ab.met.zensar.filework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileToConsole {
  public static void main(String[] args) throws FileNotFoundException {
    //
    int x = 0;

    String Package = "ab//met//zensar//filework";

    FileInputStream src = new FileInputStream(".//src//" + Package + "//src.txt");

    String op = "";

    try {

      System.out.println("\nFile Opened=>\n");

      do {

        x = src.read();
        if (x != -1) op += (char) x;
      } while (x != -1);

      System.out.println(op);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
