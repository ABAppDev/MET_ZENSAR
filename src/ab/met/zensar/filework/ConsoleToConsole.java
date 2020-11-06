package ab.met.zensar.filework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToConsole {
  public static void main(String[] args) throws IOException {
    //
    BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

    String read_data = Br.readLine();

    System.out.println("\nData Read From Console;-\n" + read_data);
  }
}
