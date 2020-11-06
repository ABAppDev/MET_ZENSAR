package ab.met.zensar.serialize;

import java.io.*;

public class Deserialization {

  public static void main(String[] args) {
    String Package = "ab//met//zensar//serialize";

    FileInputStream fos = null;
    ObjectInputStream oo=null;
    try {
      fos = new FileInputStream(".//src//" + Package + "//src.txt");

      oo = new ObjectInputStream(fos);
      User U = (User) oo.readObject();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        fos.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
