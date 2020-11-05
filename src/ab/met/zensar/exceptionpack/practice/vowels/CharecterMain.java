package ab.met.zensar.exceptionpack.practice.vowels;

public class CharecterMain {
  public static void main(String[] args) {
    //
    char ch = 'z';
    try {

      if ("AEIOUaeiou".contains(ch + "")) {
        throw new VowelException("Given Charecter Is Vowel");
      } else {

        throw new NotVowelException("Given Charecter Is Not Vowel");
      }

    } catch (NotVowelException e) {

      e.printStackTrace();
      System.out.println(e.getMessage());

    } catch (VowelException e) {

      e.printStackTrace();
      System.out.println(e.getMessage());
    }
  }
}
