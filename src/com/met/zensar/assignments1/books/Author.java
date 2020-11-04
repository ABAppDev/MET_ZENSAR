package com.met.zensar.assignments1.books;

public class Author {

    private int authorid;
    private String author_name;

    public Author(int authorid, String author_name) {
	this.authorid = authorid;
	this.author_name = author_name;
    }

    public Author(String author_name) {
	this.author_name = author_name;
    }

    public int getAuthorid() {
	return authorid;
    }

    public void setAuthorid(int authorid) {
	this.authorid = authorid;
    }

    public String getAuthorName() {
	return author_name;
    }

    public void setAuthorName(String author_name) {
	this.author_name = author_name;
    }

    public String toString() {
	return "\nAuthor ID: " + getAuthorid() + "\nAuthor Name: " + getAuthorName();
    }

}
