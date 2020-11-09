package ab.met.zensar.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Func {
  public static void main(String[] args) {
    //
    System.out.println("By Comparable");

    ArrayList<Student> alStudent = new ArrayList<>();
    alStudent.add(new Student(1, "A", 21));
    alStudent.add(new Student(2, "F", 20));
    alStudent.add(new Student(3, "B", 22));

    Collections.sort(alStudent);
    Iterator<Student> it = alStudent.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    System.out.println("\n\nBy Comparator(AGE)");

    ArrayList<StudentV2> alStudent2 = new ArrayList<>();
    alStudent2.add(new StudentV2(1, "Abhi", 21));
    alStudent2.add(new StudentV2(2, "Faraz", 20));
    alStudent2.add(new StudentV2(3, "Abhishek", 22));

    Collections.sort(alStudent2, new AgeComparator());

    Iterator<StudentV2> it2 = alStudent2.iterator();
    while (it2.hasNext()) {
      System.out.println(it2.next());
    }

    System.out.println("\n\nBy Comparator(ROLL Number)");

    Collections.sort(alStudent2, new RollNumberComparator());

    Iterator<StudentV2> it3 = alStudent2.iterator();
    while (it3.hasNext()) {
      System.out.println(it3.next());
    }
  }
}
