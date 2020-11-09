package ab.met.zensar.compare;

public class StudentV2 {
  private int sRollNum;
  private String sName;
  private int sAge;

  public StudentV2(int sRollNum, String sName, int sAge) {
    this.sRollNum = sRollNum;
    this.sName = sName;
    this.sAge = sAge;
  }

  public int getsRollNum() {
    return sRollNum;
  }

  public int getsAge() {
    return sAge;
  }

  public String getsName() {
    return sName;
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
}
