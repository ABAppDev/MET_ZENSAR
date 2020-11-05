package ab.met.zensar.exceptionpack.practice.odd_even;

public class MainOddEven {

  public static void main(String[] args) {
    //

    int Number = Integer.parseInt(args[0]);

    try {
      if (Number % 2 == 1) {
        throw new OddNumberException("Odd Number");
      }
    } catch (OddNumberException e) {
      System.out.println(e.getMessage());
    }

    try {
      if (isNumberPalindrome(Number)) {
        throw new PalindromeException("Number Is Palindrome");
      }
    } catch (PalindromeException e) {
      System.out.println(e.getMessage());
    }

    try {
      if (isArmstrongNumber(Number)) {
        throw new ArmstrongException("Number Is Armstrong");
      }
    } catch (ArmstrongException e) {
      System.out.println(e.getMessage());
    }


  }



  private static boolean isArmstrongNumber(int numberToTest) {

    int c = 0, a, temp;
    temp = numberToTest;
    while (numberToTest > 0) {
      a = numberToTest % 10;
      numberToTest = numberToTest / 10;
      c = c + (a * a * a);
    }

    return temp == c;
  }

  private static boolean isNumberPalindrome(int numberToTest) {
    int r, sum = 0, temp;
    temp = numberToTest;

    while (numberToTest > 0) {
      r = numberToTest % 10; // getting remainder
      sum = (sum * 10) + r;
      numberToTest = numberToTest / 10;
    }
    return temp == sum;
  }
}
