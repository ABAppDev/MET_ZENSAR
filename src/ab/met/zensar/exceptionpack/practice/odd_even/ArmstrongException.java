package ab.met.zensar.exceptionpack.practice.odd_even;

public class ArmstrongException extends Exception {
  /** @param message ErrorMessage */
  public ArmstrongException(String message) {
    super(message);
  }

  @Override
  public String toString() {
    return "IT IS ARMSTRONG NUMBER";
  }
}
