package com.met.zensar.employee_old;

class Employee {
    protected int eNo;
    protected String eName;
    protected float empSal;

    public Employee() {
        eNo = 100;
        eName = "Abhishek";
        empSal = 50000;
    }

    public float calSal1() {
        return empSal * 12;
    }

    public void display1() {
        System.out.println("\n\nEmployee details:\n" + eNo + "\n" + eName + "\n" + empSal);
    }
}

class Manager extends Employee // child
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

class AreaSalesManager extends Manager {
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