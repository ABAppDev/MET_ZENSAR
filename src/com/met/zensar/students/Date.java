package com.met.zensar.students;

public class Date {

	private int dd, mm, yyyy;

	public Date() {

		dd = 04;
		mm = 03;
		yyyy = 2000;

	}

	public Date(int dd, int mm, int yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	public int getDay() {
		return dd;
	}

	public void setDay(int dd) {
		this.dd = dd;
	}

	public int getMonth() {
		return mm;
	}

	public void setMonth(int mm) {
		this.mm = mm;
	}

	public int getYear() {
		return yyyy;
	}

	public void setYear(int yyyy) {
		this.yyyy = yyyy;
	}

	public boolean isDateValid() {
		if (1990 <= yyyy && yyyy <= 2020) {
			if (1 <= mm && mm <= 12) {
				if (mm == 2 && yyyy % 4 == 0 && 1 <= dd && dd <= 29)
					return true;
				else if (mm == 2 && yyyy % 4 != 0 && 1 <= dd && dd <= 28)
					return true;
				else if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && (1 <= dd && dd <= 30))
					return true;
				else if ((mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) && 1 <= dd
						&& dd <= 31)
					return true;

				else
					return false;
			} else
				return false;
		} else
			return false;
	}

	public String toString() {
		return dd + "/" + mm + "/" + yyyy;
	}

}
