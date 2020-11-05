package ab.met.zensar.exceptionpack.practice.odd_even;

public class PalindromeException extends Exception {
  /** @param message ErrorMessage */
  public PalindromeException(String message) {
    super(message);
  }


  @Override
  public String toString() {
    return "IT IS PALINDROME NUMBER";
  }
}
