package ab.met.zensar.assignments1.mobilepackage;

public class MainMobile {

  public static int MAX = 10;

  public static void main(String[] args) {
    //
    Mobile M[] = new Mobile[10];
    M[0] = new Mobile("a1", 5000, 8000);
    M[1] = new Mobile("b2", 5000, 7000);
    M[2] = new Mobile("note1", 4000, 15000);
    M[3] = new Mobile("note2", 4000, 15000);
    M[4] = new Mobile("UV1", 5000, 15600);
    M[5] = new Mobile("Pro", 4000, 17000);
    M[6] = new Mobile("Super", 4000, 20000);
    M[7] = new Mobile("Tab", 7000, 20000);
    M[8] = new Mobile("Super Pro", 4500, 100000);
    M[9] = new Mobile("Flagship1", 5050, 100000);

    int i = 0;

    while (i < MAX) {
      for (int j = i+1; j < MAX; j++) {
        if (M[i].getPrice() == M[j].getPrice()) {
          System.out.println("\n\n" + M[i].toString() + "\n" + M[j].toString());
        }
      }
      i++;
    }


  }
}
