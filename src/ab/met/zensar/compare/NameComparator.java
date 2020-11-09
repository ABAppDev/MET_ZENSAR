package ab.met.zensar.compare;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentV2> {
  @Override
  public int compare(StudentV2 o1, StudentV2 o2) {
    return o1.getsName().compareToIgnoreCase(o2.getsName());
  }
}
