package com.met.zensar.assignments1.books;

public class MainBook {

    public static void main(String[] args) {

	int MAX = 3;
	Book[] set = new Book[MAX];

	set[0] = new Book("Wings", 200, "bravo");
	set[1] = new Book("Great Book", 250, "alpha");
	set[2] = new Book("Let Start Code", 180, "Charlie");

	set[1].toString();

	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		if (set[j].getPrice() > set[i].getPrice()) {
		    Book temp = set[j];
		    set[j] = set[i];
		    set[i] = temp;
		}
	    }
	}

	System.out.print(set[0].toString());
	System.out.print(set[1].toString());
	System.out.print(set[2].toString());

    }

}
