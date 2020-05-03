package p004_CicliIterativi;

import java.util.Scanner;

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
