//
//	Name:		Carlos, Giles
//	Project:	#4
//	Due:		November 28, 2018
//	Course: 	CS-1400-02-F18
//
//	Description:
//		One class that allows the user to create an instance of an element.
//		One class that acquires information about elements in the periodic table
//		and allows the user to get information from the periodic table,
//		such as atomic number, atomic mass, name, and abbreviation by utiliziing
// 		the Element class. One class utilizing the PeriodicTable class to test if
// 		the first two classes run properly.

public class Element {
	private int atomicNumber;
	private String name;
	private String abbreviation;
	private float atomicMass;


	/**
		Create a new element
    		@param atomicNumber the atomic number of the element
    		@param name the name of the element
    		@param abbreviation the abbreviation of the element
     		@param atomicMass the atomic mass of the element
	*/
	public Element(int atomicNumber, String name, String abbreviation, float atomicMass) {
		this.atomicNumber = atomicNumber;
		this.name = name;
		this.abbreviation = abbreviation;
		this.atomicMass = atomicMass;
	}

	/**
		Get the atomic number of the element.
		@return the atomic number of the element.
	*/
	public int getAtomicNumber() {
		return atomicNumber;
	}

	/**
		Get the name of the element.
		@return the name of the element.
	*/
	public String getName() {
		return name;
	}

	/**
		Get the abbreviation of the element.
		@return the abbreviation of the element.
	*/
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
		Get the atomic mass of the element.
		@return the atomic mass of the element.
	*/
	public float getAtomicMass() {
		return atomicMass;
	}

	/**
		Get the String representation of the element.
		@return the String representation of the element.
	*/
	@Override
	public String toString() {
		return String.format("%3d %-12s	%s	%6.2f\n", atomicNumber, name, abbreviation, atomicMass);
	}

}

