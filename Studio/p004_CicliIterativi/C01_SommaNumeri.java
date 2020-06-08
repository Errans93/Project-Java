package p004_CicliIterativi;

import java.util.Scanner;

//Il comando while consente di ripetere un comando (o un blocco)
//fintanto che la condizione specifica sia vera.

//Il comando while ha la seguante forma:
//while(condizione) comando
//dove:
//-->la condizione è detta guardia
//-->la guarda può essere una qualsiasi espressione booleana
//-->il comando (o blocco) è detto corpo del while

//Semantica
//1) La guardia viene valutata
//2)Se la guardia è vera si esegue il corpo e si ricomincia dal punto 1)
//3)Se la guardia è falsa si salta il corpo e si procede con l'istruzione
//successiva al while

//NOTE:
//Una proprietà importante dei blocchi è che le variabili dichiarate all'interno 
//di un blocco sono locali al blocco stesso e, quindi, scompaiono dopo 
//l'esecuzione del blocco. 
//Per esempio nel seguente programma la variabile 
//somma è stata dichiarata al di fuori del ciclo while, questo allo scopo di 
//poterla stampare come risultato una volta finito il ciclo.
//Se provassimo a stampare numeroSomma al di fuori del ciclio il compilatore 
//lo segnalerebbe come errore, poichè è una variabile LOCALE del ciclo while.

public class C01_SommaNumeri {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il numero di numeri che vuoi sommare");
		int numeroNumeri = input.nextInt();
		int contatore = 0;
		double somma = 0;

		while (contatore < numeroNumeri) {
			if (contatore == 0) {
				System.out.println("Inserisci il primo numero della serie che vuoi sommare");
				double numeroSomma = input.nextDouble();
				somma = somma + numeroSomma;
				contatore = contatore + 1;

			} else {
				System.out.println("Inserisci il prossimo numero");
				double numeroSomma = input.nextDouble();
				somma = somma + numeroSomma;
				contatore = contatore + 1;
			}

		}
		System.out.println();
		System.out.println("La somma dei numeri che hai scelto è: " + somma);
	}
}
