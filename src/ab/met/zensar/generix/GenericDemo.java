package ab.met.zensar.generix;

public class GenericDemo {
  private Object o;

  public GenericDemo(Object obj) {
    o = obj;
  }

  public Object getData() {
    return o;
  }

  public static void main(String[] args) {
    GenericDemo G = new GenericDemo(100);
    Integer i = (Integer) G.getData();
    GenericDemo S = new GenericDemo("hello");
    String Str = (String) S.getData();

    System.out.println(i+"\n"+Str);
  }
}
