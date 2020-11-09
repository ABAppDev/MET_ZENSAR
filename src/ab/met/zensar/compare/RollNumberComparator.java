package ab.met.zensar.compare;

import java.util.Comparator;

public class RollNumberComparator implements Comparator<StudentV2> {
  @Override
  public int compare(StudentV2 o1, StudentV2 o2) {
    return Integer.compare(o1.getsRollNum(), o2.getsRollNum());
  }
}
