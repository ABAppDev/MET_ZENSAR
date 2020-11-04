package ab.met.zensar.assignments1.employee;

public class Employee {
    protected int eNo;
    protected String eName;
    protected float empSal;

    public Employee() {
	eNo = 100;
	eName = "Abhishek";
	empSal = 50000;
    }

    public float calSal() {
	return empSal * 12;
    }

    public void display() {
	System.out.println("\n\nEmployee details:\n" + eNo + "\n" + eName + "\n" + empSal+" p.m");
    }
}



