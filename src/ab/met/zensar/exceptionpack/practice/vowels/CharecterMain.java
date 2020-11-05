package ab.met.zensar.exceptionpack.practice.vowels;

public class CharecterMain {

  public static void charTest(char ch) throws VowelException, NotVowelException {
    if ("AEIOUaeiou".contains(ch + "")) {
      throw new VowelException();
    } else {

      throw new NotVowelException();
    }
  }

  public static void main(String[] args) {
    //
    char ch = 'z';

    try {
      charTest(ch);
    } catch (VowelException e) {
      e.printStackTrace();
    } catch (NotVowelException e) {
      e.printStackTrace();
    }
  }
}
