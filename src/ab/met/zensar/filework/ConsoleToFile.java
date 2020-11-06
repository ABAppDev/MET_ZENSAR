package ab.met.zensar.filework;

import java.io.*;

public class ConsoleToFile {
  public static void main(String[] args) throws FileNotFoundException {
    //
    int x = 0;
    String Package = "ab//met//zensar//filework";
    String Input;
    byte[] Data = null;

    FileOutputStream dest = new FileOutputStream(".//src//" + Package + "//dest.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    try {
      Input = br.readLine();
      Data = Input.getBytes();

      while (x < Data.length) {
        if (Data[x] != -1) dest.write((char) Data[x]);
        x++;
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
