package p003_IstruzioniCondizionali;

import java.util.Scanner;

//In alcuni casi un comando if pu� diventare lungo da scrivere:
//-->Un programma che legge un numero e lo trasforma in un giorno

public class C08_Giorno {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un numero da 1 a 7, questo corrisponder� "
				+ "a un giorno della settimana");
		int scelta = input.nextInt();
		
		if (scelta == 0)
			System.out.println("Zero non vale. Scelta sbagliata.");
		else if (scelta == 1)
			System.out.println("Hai scelto luned�");
		else if (scelta == 2)
			System.out.println("Hai scelto marted�");
		else if (scelta == 3)
			System.out.println("Hai scelto mercoled�");
		else if (scelta == 4)
			System.out.println("Hai scelto gioved�");
		else if (scelta == 5)
			System.out.println("Hai scelto venerd�");
		else if (scelta == 6)
			System.out.println("Hai scelto sabato");
		else if (scelta == 7)
			System.out.println("Hai scelto domenica");
		else 
			System.out.println("Non esistono giorni della settimana superiori a 7");
	}

}
