package ab.met.zensar.generix;

public class CustomGenericDemo<T> {
  private T o;

  public CustomGenericDemo(T obj) {
    o = obj;
  }

  public T getData() {
    return o;
  }

  public static void main(String[] args) {

    CustomGenericDemo<Integer> G = new CustomGenericDemo<Integer>(1000);
    Integer i = G.getData();

    CustomGenericDemo<String> S = new CustomGenericDemo<String>("hello World");
    String Str = S.getData();

    System.out.println(i + "\n" + Str);
  }
}
