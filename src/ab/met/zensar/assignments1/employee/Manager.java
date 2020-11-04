package ab.met.zensar.assignments1.employee;

public class Manager extends Employee // child
{
    protected int manNo;
    protected String manName;
    protected float manSal;
    protected int bonus;

    public Manager() {
        manNo = 201;
        manName = "Alax";
        manSal = 67000;
        bonus = 8900;
    }

    public float calSal2() {
        return ((manSal * 12) + bonus);
    }

    public void display2() {
        System.out.println("\n\nManagers:\n" + manNo + "\n" + manName + "\n" + manSal);
    }
}