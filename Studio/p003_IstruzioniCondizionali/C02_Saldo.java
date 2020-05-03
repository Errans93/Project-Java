package p003_IstruzioniCondizionali;

import java.util.Scanner;

//I comandi if - else possono essere annidati --> si può inserire un if - else
//in un ramo di un altro if - else.

//NOTE:
//--> Il PRIMO else fa riferimento al SECONDO if
//--> L'uso attento degli spazi e "a capo" nel programma (indentazione)
//semplifica la lettura e la comprensione del codice

public class C02_Saldo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il saldo del tuo conto corrente:");
		double saldo = input.nextInt();
		if (saldo >= 0)
			if (saldo > 0)
				System.out.println("Saldo positivo");
			else
				System.out.println("Saldo uguale zero");
		else
			System.out.println("Saldo negativo");

		// Un caso particolare di if - else annidati sono gli if - else concatenati:
		// --> il ramo else è costituito da un altro ramo if
		// --> la guardia del secondo if considera un caso alternativo
		// a quello considerato dalla prima guardia dell'if

		double saldo1 = input.nextInt();

		if (saldo > 0)
			System.out.println("Saldo positivo");
		else if (saldo == 0)
			System.out.println("Saldo uguale a zero");
		else
			System.out.println("Saldo negativo");

	}

}
