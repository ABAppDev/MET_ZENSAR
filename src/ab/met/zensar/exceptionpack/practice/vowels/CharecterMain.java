package ab.met.zensar.exceptionpack.practice.vowels;

public class CharecterMain {

  public static void charTest(char ch) throws VowelException, NotVowelException {
    if ("AEIOUaeiou".contains(ch + "")) {
      throw new VowelException("Given Charecter Is Vowel");
    } else {

      throw new NotVowelException("Given Charecter Is Not Vowel");
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
