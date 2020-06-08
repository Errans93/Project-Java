package p003_IstruzioniCondizionali;

import java.util.Scanner;

//In caso dovessimo esprimere condizioni più complesse?

//ES: Scrivere un prog che chiede all'utente di inserire due numeri interi(ore e minuti)
// e stampa "E' un orario" se le due cifre rappresentano un orario oppure stampa
//"Non è un orario" altrimenti.

//Esempio di Input:
//--> Input 15 e 27 -> "E' un orario"
//--> Input 35 e 89 -> "Non è un orario"

public class C03_Orario {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Inserisci le ore: ");	
		int ore = input.nextInt();
		System.out.println("Inserisci i minuti: ");
		int min = input.nextInt();
		
		if (ore < 0)
			System.out.println("Non è un orario");
		else if (ore > 23)
			System.out.println("Non è un orario");
		else if (min < 0)
			System.out.println("Non è un orario");
		else if (min > 60)
			System.out.println("Non è un orario");
		else 
			System.out.println("E' un orario");
	}

}
