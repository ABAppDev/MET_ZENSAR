package ab.met.zensar.assignments1.employee;

public class MainEmployee {

    public static void main(String[] args) {

	/*
	 * AreaSalesManager a1 = new AreaSalesManager();
	 * 
	 * a1.display(); System.out.println("\nEmployee Yearly salary is : " +
	 * a1.calSal()); a1.display();
	 * System.out.println("\nManagers basic salary is : " + a1.manSal);
	 * System.out.println("\nManagers salary + Bonus is : " + a1.calSal());
	 * a1.display();
	 * System.out.println("\nAreaSalesManager salary with other Allowance is : " +
	 * a1.calSal());
	 */

	Employee E = new Employee();
	E.display();
	System.out.print(E.calSal()+" p.a.");
	
	Employee M = new Manager();
	M.display();
	System.out.print(M.calSal()+" p.a.");
	

	Employee A = new AreaSalesManager();
	A.display();
	System.out.print(A.calSal()+" p.a.");
	

    }

}
