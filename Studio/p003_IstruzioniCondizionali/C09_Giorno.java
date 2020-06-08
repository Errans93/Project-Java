package p003_IstruzioniCondizionali;

import java.util.Scanner;

//Un if concatenato che confronta:
//-->il risultato di una espressione di tipo int o char con un
//numero di letterali alternativi (1, 2, 3, 4,...) può essere
//sostituito da un comando switch.

//NOTE:
//Il comando break fa saltare l'esecuzione alla parentesi } chiusa
//dopo lo switch.
//-->evita, ad esempio, che dopo aver eseguito il case 3 venga 
//eseguito ache il case 4.
//-->tra l'etichetta case "n" e il comando break ci può essere più di
//un comando senza bisogno di parentesi graffe aggiuntive. 

public class C09_Giorno {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un numero da 1 a 7, questo corrisponderà "
				+ "a un giorno della settimana");
		int scelta = input.nextInt();
		
		switch (scelta) {
		case 0: System.out.println("Zero non vale. Scelta sbagliata."); break;
		case 1: System.out.println("Hai scelto lunedì"); break;
		case 2: System.out.println("Hai scelto martedì"); break;
		case 3: System.out.println("Hai scelto mercoledì"); break;
		case 4: System.out.println("Hai scelto giovedì"); break;
		case 5: System.out.println("Hai scelto venerdì"); break;
		case 6: System.out.println("Hai scelto sabato"); break;
		case 7: System.out.println("Hai scelto domenica"); break;
		default: System.out.println("Non esistono giorni della settimana superiori a 7"); break; 
		}
		
	}

}
