package edu.pitt.cs;

public class CatImpl implements Cat {

	// Fill in with member variables
	int catID;
	String catName;
	boolean rented = false;

	public CatImpl(int id, String name) {
		// Fill in
		catID = id; 
		catName = name;
	}

	public void rentCat() {
		// Fill in
		rented = true;
	}

	public void returnCat() {
		// Fill in
		rented = false;
	}

	public void renameCat(String name) {
		// Fill in
		catName = name;
	}

	public String getName() {
		//Fill in
		return catName;
	}

	public int getId() {
		//Fill in
		return catID;
	}

	public boolean getRented() {
		// Fill in
		return rented;
	}

	public String toString() {
		// Fill in
		return "ID "+ catID + ". " + catName; 
	}

}