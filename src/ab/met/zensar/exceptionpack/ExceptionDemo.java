package ab.met.zensar.exceptionpack;

public class ExceptionDemo {
  public static void main(String[] args) {
    //

    int a = 55, b = 0, c;
    String aa = "55a";

    String after = null;

    try {
      c = a / b;
      System.out.println("Division = " + c);

    //  c = Integer.parseInt(aa) / b;
    //  System.out.println("Division = " + c);

      after = "TRY";

    } catch (ArithmeticException A) {
      // A.printStackTrace();
      System.out.println(A.getMessage());
      after = "CATCH ArithmeticException";

    } catch (Exception E) {
      // E.printStackTrace();
      System.out.println(E.getMessage());
      after = "CATCH Exception";

    } finally {
      System.out.println("Finally Block Executed after " + after);
    }

    System.out.println("Program End");
  }
}
