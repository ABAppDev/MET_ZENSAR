package ab.met.zensar.exceptionpack.practice.vowels;

public class VowelException extends Exception {
  public VowelException(String message) {
    super(message);
  }

  @Override
  public String toString() {
    return "IT IS VOWEL";
  }
}
