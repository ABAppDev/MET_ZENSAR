package ab.met.zensar.annots;

import java.lang.reflect.Method;

public class CustomClass {
  @DemoAnnotation(name = "BusinessAction", no = 5)
  public void aMethod() {}

  public static void main(String[] args) throws NoSuchMethodException, SecurityException {
    CustomClass c1 = new CustomClass();
    c1.aMethod();


    Class c = c1.getClass();
    Method m = c.getMethod("aMethod");

    DemoAnnotation d = m.getAnnotation(DemoAnnotation.class);

    System.out.println("Annotation on this class are " + d.name() + " " + d.no());
  }
}
