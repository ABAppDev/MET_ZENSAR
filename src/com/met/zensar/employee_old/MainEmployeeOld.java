package com.met.zensar.employee_old;

public class MainEmployeeOld {

    public static void main(String[] args) {
	AreaSalesManager a1 = new AreaSalesManager();
	a1.display1();
	System.out.println("\nEmployee Yearly salary is : " + a1.calSal1());
	a1.display2();
	System.out.println("\nManagers basic salary is : " + a1.manSal);
	System.out.println("\nManagers salary + Bonus is : " + a1.calSal2());
	a1.display3();
	System.out.println("\nAreaSalesManager salary with other Allowance is : " + a1.calSal3());

    }

}
