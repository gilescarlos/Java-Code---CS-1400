//
//	Name:		Carlos, Giles
//	Project:	#5
//	Due:		December 10, 2018
//	Course: 	CS-1400-02-F18
//
//	Description:
//		A class that allows the user to create an instance of a ship.
//		User can set the name of the ship and the year the ship was built.
//

public class Ship {
	private String name;
	private int year;

	/**
		Create a new ship.
    	@param name the name of the ship.
    	@param year the year the ship was built.
	*/
	public Ship(String name, int year) {
		setName(name);
		setYear(year);
	}

	/**
		Set the name of the ship.
		@param the name of the ship.
	*/
	public void setName(String name) {
		this.name = name.replace("_", " ");
	}

	/**
		Set the year the ship was built.
		@param the year the ship was built.
	*/
	public void setYear(int year) {
		this.year = year;
	}

	/**
		Get the name of the ship.
		@return the name of the ship.
	*/
	public String getName() {
		return name;
	}

	/**
		Get the year the ship was built.
		@return the year the ship was built.
	*/
	public int getYear() {
		return year;
	}

	/**
		Get the String representation of the ship.
		@return the String representation of the ship.
	*/
	@Override
	public String toString() {
		return String.format("%s %7d\n", name, year);
	}
}
