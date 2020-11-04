package ab.met.zensar.assignments1.employee;

public class AreaSalesManager extends Manager {
    protected int petrolAllowance;
    protected int foodAllowance;
    protected int mobileAllowance;

    public AreaSalesManager() {
        petrolAllowance = 2500;
        foodAllowance = 6000;
        mobileAllowance = 1000;

    }

    public float calSal3() {
        return ((manSal * 12) + petrolAllowance + foodAllowance + mobileAllowance);
    }

    public void display3() {
        System.out.println("Area Sales manager details:\npetrolAllowance=" + petrolAllowance + "\nfoodAllowance="
                + foodAllowance + "\nmobileAllowance=" + mobileAllowance);
    }
}