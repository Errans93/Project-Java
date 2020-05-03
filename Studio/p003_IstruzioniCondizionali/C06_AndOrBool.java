package p003_IstruzioniCondizionali;

import java.util.Scanner;

public class C06_AndOrBool {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci le ore: ");
		int ore = input.nextInt();
		System.out.println("Inserisci i minuti: ");
		int min = input.nextInt();

		boolean ore_ok = (ore >= 0 && ore <= 23);
		boolean min_ok = (min >= 0 && min <= 60);

		// AND
		if (ore_ok && min_ok)
			System.out.println("E' un orario");
		else
			System.out.println("Non è un orario");

		// OR
		if (!ore_ok || !min_ok)
			System.out.println("Non è un orario");
		else
			System.out.println("E' un orario");
	}

}
