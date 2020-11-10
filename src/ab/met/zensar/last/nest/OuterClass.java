package ab.met.zensar.last.nest;

public class OuterClass {
  private int oData = 100;

  public void display() {
    System.out.println("Outer class Data is:" + oData);
  }
  // Inner class within outer class
  class InnerClass {
    private int iData = 900;

    public void print() {
      System.out.println("Inner class data is:" + iData);
      System.out.println("Outer class Data is:" + oData);
    }
  }

  // static Inner class
  static class InnerClassStatic {
    private static int val = 900;

    public static void print() {
      System.out.println(val);
    }
  }

  // method local Inner class
  public static void test() {
    class MLI {
      private int val = 90;

      public void print() {
        System.out.println(val);
      }
    }
    MLI m = new MLI();
    m.print();
  }
}

class Entry {

  public static void main(String[] args) {
    OuterClass o = new OuterClass();
    o.display();

    OuterClass.InnerClass i1 = o.new InnerClass();
    i1.print();

    OuterClass.InnerClassStatic s1 = new OuterClass.InnerClassStatic(); // obj of static inner class
  }
}
