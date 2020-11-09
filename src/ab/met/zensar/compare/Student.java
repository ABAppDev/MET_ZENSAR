package ab.met.zensar.compare;

public class Student implements Comparable {
  private int sRollNum;
  private String sName;
  private int sAge;

  public Student(int sRollNum, String sName, int sAge) {
    this.sRollNum = sRollNum;
    this.sName = sName;
    this.sAge = sAge;
  }

  @Override
  public String toString() {
    return "Student{"
        + "sRollNum="
        + sRollNum
        + ", sName='"
        + sName
        + '\''
        + ", sAge="
        + sAge
        + '}';
  }

  @Override
  public int compareTo(Object o) {

    Student S = (Student) o;

    // return (S.sAge==sAge?0:(S.sAge>sAge?-1:1));
    return (Integer.compare(sAge, S.sAge));
  }
}
