package ab.met.zensar.exceptionpack.practice.odd_even;

public class MainOddEven {

  public static void main(String[] args)
      throws OddNumberException, PalindromeException, ArmstrongException {
    //

    int Number = Integer.parseInt(args[0]);

    isOddNumber(Number);
    isNumberPalindrome(Number);
    isArmstrongNumber(Number);

  }

  private static void isOddNumber(int number) throws OddNumberException {
    if (number % 2 == 1) throw new OddNumberException("ODD NUMBER");
  }

  private static void isArmstrongNumber(int numberToTest) throws ArmstrongException {

    int c = 0, a, temp;
    temp = numberToTest;
    while (numberToTest > 0) {
      a = numberToTest % 10;
      numberToTest = numberToTest / 10;
      c = c + (a * a * a);
    }

    if (temp == c) {
      throw new ArmstrongException("This Is Armstrong Number");
    }
  }

  private static void isNumberPalindrome(int numberToTest) throws PalindromeException {
    int r, sum = 0, temp;
    temp = numberToTest;

    while (numberToTest > 0) {
      r = numberToTest % 10; // getting remainder
      sum = (sum * 10) + r;
      numberToTest = numberToTest / 10;
    }

    if (temp == sum) {
      throw new PalindromeException("This Is Armstrong Number");
    }
  }
}
