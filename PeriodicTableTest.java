import java.io.*;

public class PeriodicTableTest {
	public static void main(String[] args) throws FileNotFoundException {
		PeriodicTable periodicTable = new PeriodicTable();
		periodicTable.print();

		Element element = periodicTable.findAtomicNumber(10);
		Element element2 = periodicTable.findName("Helium");
		Element element3 = periodicTable.findAbbreviation("K");

		System.out.println();

		if (element != null) {
			System.out.print(element);
		}

		if (element2 != null) {
			System.out.print(element2);
		}

		if (element3 != null) {
			System.out.println(element3);
		}

		System.out.printf("The average mass: %20.2f\n",  periodicTable.getAverageMass());
	}
}
