package p005_MetodiAusiliari;

import java.util.Scanner;

/* 
Rivediamo il programma Orario:

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

-->Ora possiamo fare il controllo al un metodo ausiliario!!
*/

public class C03_OrarioMetodo {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci le ore: ");
		int ore = input.nextInt();
		System.out.println("Inserisci i minuti: ");
		int min = input.nextInt();
		
		if (orarioAnd(min, ore)) {
			
			System.out.println("Risultato AND --> E' un orario");
			
		} else
			System.out.println("Non è un orario");
		
if (orarioOr(min, ore)) {
			
			System.out.println("Non è un orario");
			
		} else
			System.out.println("Risultato OR --> E' un orario");
	}
	
	//AND
	private static boolean orarioAnd(int min, int ore) {

		boolean ore_ok = (ore >= 0 && ore <= 23);
		boolean min_ok = (min >= 0 && min <= 60);
		
		return (ore_ok && min_ok);
	}
	
	//OR
	private static boolean orarioOr(int min, int ore) {

		boolean ore_ok = (ore >= 0 && ore <= 23);
		boolean min_ok = (min >= 0 && min <= 60);
		
		return (!ore_ok || !min_ok);
	}

}
