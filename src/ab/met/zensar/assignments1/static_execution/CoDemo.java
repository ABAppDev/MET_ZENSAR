package ab.met.zensar.assignments1.static_execution;


public class CoDemo {

    public static int Number;

    static {
        Number = 100;
        System.out.println("Static Block Executed");
    }

    // public static void main(String[] args) {
    // TODO Auto-generated method stub
    //System.out.println("Main Method Executed " + Number);
    //}

}