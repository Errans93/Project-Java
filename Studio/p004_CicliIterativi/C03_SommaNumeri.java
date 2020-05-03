package p004_CicliIterativi;

//Andiamo a modificare la classe C01_SommaNumeri con quello che abbiamo imparato 
//nella classe C02_Assignment, ossia con l'aggiunta di comandi di assegnamento ausiliari 


import java.util.Scanner;

public class C03_SommaNumeri {
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
				somma += numeroSomma;//Uniche modifiche
				contatore ++;//Uniche modifiche

			} else {
				System.out.println("Inserisci il prossimo numero");
				double numeroSomma = input.nextDouble();
				somma += numeroSomma;//Uniche modifiche
				contatore ++;//Uniche modifiche
			}

		}
		System.out.println();
		System.out.println("La somma dei numeri che hai scelto è: " + somma);
	}
}
