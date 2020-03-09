//
//	Name:		Carlos, Giles
//	Project:	#5
//	Due:		December 10, 2018
//	Course: 	CS-1400-02-F18
//
//	Description:
//		A class that demonstrates the use of inheritance and polymorphism while
//		incorporating the superclass, Ship.java, and the two subclasses,
//		CruiseShip.java and CargoShip.java. An array list and array are used to
//		get the ship inventory of company and the inventory is printed, with calculations
//		such as maximum passengers and maximum cargo.
//

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class ShipDemo {

	public static void main(String[] args) throws FileNotFoundException {
		char type;
		String companyName, name;
		String yearBuilt;
		int numberOfShips, parameter;

		File file;
		if (args.length == 1) {
			file = new File(args[0]);
		} else {
			file = new File("myShips.txt");
		}
		Scanner input = new Scanner(file);
		ArrayList<Ship> ArrayListShips = new ArrayList<>();

		companyName = input.next();
		numberOfShips = input.nextInt();
		while (input.hasNext()) {
			type = input.next().charAt(0);
			name = input.next();
			yearBuilt = input.next();
			int year = Integer.parseInt(yearBuilt);
			parameter = input.nextInt();
			switch (type) {
				case 'c':
					CruiseShip cruiseShip = new CruiseShip(name, year, parameter);
					ArrayListShips.add(cruiseShip);
					break;
				case 'C':
					CargoShip cargoShip = new CargoShip(name, year, parameter);
					ArrayListShips.add(cargoShip);
					break;
			}
		}
		Ship[] shipInventory = new Ship[ArrayListShips.size()];
		for (int i = 0; i < shipInventory.length; i++) {
			shipInventory[i] = ArrayListShips.get(i);
		}
		input.close();

		System.out.println();
		System.out.println("Welcome to " + companyName.replace("_", " ") + " by Giles Carlos");
		System.out.println();
		System.out.println("Ship name		       Type");
		System.out.println("-------------------------      --------------");

		int totalPassengers = 0;
		int totalTonnage = 0;
		for(int i = 0; i < shipInventory.length; i++) {
			System.out.print(shipInventory[i].toString());
			if (shipInventory[i] instanceof CargoShip) {
				totalTonnage += ((CargoShip)shipInventory[i]).getCargoCapacity();
			} else if (shipInventory[i] instanceof CruiseShip) {
				totalPassengers += ((CruiseShip)shipInventory[i]).getMaxPassengers();
			}
		}
		System.out.println();
		System.out.println("Total Ships = " + numberOfShips);
		System.out.println("Total Passengers = " + totalPassengers);
		System.out.println("Total Tonnage = " + totalTonnage);
	}
}
