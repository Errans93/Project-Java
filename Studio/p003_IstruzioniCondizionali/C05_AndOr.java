package p003_IstruzioniCondizionali;

import java.util.Scanner;

//OR (||) combina condizioni delle quali almeno una deve essere vera

//AND (&&) combina condizioni che devono essere TUTTE vere

public class C05_AndOr {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Inserisci le ore: ");	
		int ore = input.nextInt();
		System.out.println("Inserisci i minuti: ");
		int min = input.nextInt();
		
		//OR
		if (ore < 0 || ore > 23 || min < 0 || min > 60)
			System.out.println("Non è un orario");
		else 
			System.out.println("E' un orario");
		
		//AND
		if (ore >= 0 && ore <= 23 && min >= 0 && min <= 60)
			System.out.println("E' un orario");
		else
			System.out.println("Non è un orario");
}
	
	

}
