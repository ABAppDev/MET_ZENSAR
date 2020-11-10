package ab.met.zensar.last;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoReflection {

  public static void main(String[] args) {
    //

    String className = args[0];

    try {
      Class C = Class.forName(className);

      Field F[] = C.getFields();
      for (Field field : F) System.out.println("\nField -\t " + field);

      Constructor Con[] = C.getConstructors();
      for (Constructor constructor : Con) System.out.println("\nConstructor -\t " + constructor);

      Method M[] = C.getMethods();
      for (Method method : M) System.out.println("\nMethod -\t " + method);

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
