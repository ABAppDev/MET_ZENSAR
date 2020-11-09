package ab.met.zensar.compare;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentV2> {
    @Override
    public int compare(StudentV2 o1, StudentV2 o2) {
        return Integer.compare(o1.getsAge(),o2.getsAge());
    }
}
