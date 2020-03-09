import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class PeriodicTable {
	private Element[] periodicTable;

	public PeriodicTable() throws FileNotFoundException {
		loadTable();
	}
	private void loadTable() throws FileNotFoundException {
		File file = new File("/user/tvnguyen7/data/periodictable.dat");
		Scanner input = new Scanner(file);
		ArrayList<Element> ArrayListPeriodicTable = new ArrayList<>();
		int atomicNumber;
		String name;
		String abbreviation;
		float atomicMass;
		while (input.hasNext()) {
			atomicNumber = input.nextInt();
			abbreviation = input.next();
			atomicMass = input.nextFloat();
			name = input.next();
			Element e = new Element(atomicNumber, name, abbreviation, atomicMass);
			ArrayListPeriodicTable.add(e);
		}
		ArrayListPeriodicTable.size();
		periodicTable = new Element[ArrayListPeriodicTable.size()];
		for (int i = 0; i < periodicTable.length; i++) {
			periodicTable[i] = ArrayListPeriodicTable.get(i);
		}
		input.close();
	}

	public void print()
	{
		System.out.println("Periodic Table by G. Carlos");
		System.out.println();
		System.out.println("Number of elements: " + periodicTable.length);
		System.out.println();
		System.out.printf("Ano Name 		Abr 	  Mass\n");
		System.out.printf("--- ---------------	---  ---------\n");

		for (int index = 0; index < periodicTable.length; index++) {
			System.out.print(periodicTable[index]);
		}
	}

	public Element findAtomicNumber(int atomicNumber)
	{
		boolean found = false;
		int index = 0;
		while (!found && index < periodicTable.length)
		{
			if (periodicTable[index].getAtomicNumber() == atomicNumber)
			{
				found = true;
			} else {
				index++;
			}
		}
		return found ? periodicTable[index] : null;
	}

	public Element findAbbreviation(String abbreviation)
	{
		boolean found = false;
		int index = 0;
		while (!found && index < periodicTable.length)
		{
			if (periodicTable[index].getAbbreviation().equalsIgnoreCase(abbreviation))
			{
				found = true;
			} else {
				index++;
			}
		}
		return found ? periodicTable[index] : null;
	}

	public Element findName(String name)
	{
		boolean found = false;
		int index = 0;
		while (!found && index < periodicTable.length)
		{
			if (periodicTable[index].getName().equalsIgnoreCase(name))
			{
				found = true;
			} else {
				index++;
			}
		}
		return found ? periodicTable[index] : null;
	}

	public float getAverageMass() {
		float sum = 0;
		for (int index = 0; index < periodicTable.length; index++) {
			sum += periodicTable[index].getAtomicMass();
		}
		return sum / periodicTable.length;
	}

}


