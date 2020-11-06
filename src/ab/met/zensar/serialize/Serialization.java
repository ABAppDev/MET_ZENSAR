package ab.met.zensar.serialize;

import java.io.*;

public class Serialization {
  public static void main(String[] args) {
    //
    FileOutputStream fos = null;
    ObjectOutputStream oo = null;

    String Package = "ab//met//zensar//serialize";

    try {
      fos = new FileOutputStream(".//src//" + Package + "//src.txt");

      oo = new ObjectOutputStream(fos);
      oo.writeObject(new User("java", "passme"));

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        fos.close();
        oo.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
