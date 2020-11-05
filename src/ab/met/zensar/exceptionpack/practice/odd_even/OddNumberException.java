package ab.met.zensar.exceptionpack.practice.odd_even;

public class OddNumberException extends Exception {
  /** @param message */
  public OddNumberException(String message) {
    super(message);
  }


  @Override
  public String toString() {
    return "IT IS ODD NUMBER";
  }

}
