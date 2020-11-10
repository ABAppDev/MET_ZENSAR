package ab.met.zensar.last.nest;

public abstract class Car {
  public abstract void drive();
}

// Annonymous inner class originating from super class

class Abc {
  Car c1 =
      new Car() {
        public void drive() {
          System.out.println("car is running");
        }
      };
}

// Annonymous inner class Originating from super class

interface Behave {
  void drive();
}

class Test {
  Behave b1 =
      new Behave() {

        public void drive() {}
      };
}
