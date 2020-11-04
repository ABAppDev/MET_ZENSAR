package com.met.zensar.students;

public class MainStudent {

	private static int roll_counter = 0;
	private int rollnumber;
	private String name;
	private Date birthdate;

	public MainStudent(String name, Date birthdate) {
		this.rollnumber = ++roll_counter;
		this.name = name;
		this.birthdate = birthdate;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int calculateAge(int currentyear) {
		return (currentyear - this.birthdate.getYear());
	}

	public void display() {
		System.out.print("\n\nStudent Name = " + this.name + "\nRoll Number = " + this.rollnumber + "\nBirth Date = "
				+ this.birthdate.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainStudent S2 = new MainStudent("Abhishek Bhalerao", new Date(4, 3, 2000));
		S2.display();

		System.out.println("\nStudent " + S2.getRollnumber() + " Age is " + S2.calculateAge(2020));
		
		
		Date A = new Date(1,5,2020);
		Date B = new Date(10,3,1995);
		
		
		Date temp = A;
		A=B;
		B=temp;
		System.out.println("\n"+A.toString()+"\t"+B.toString());
		

	}

}
