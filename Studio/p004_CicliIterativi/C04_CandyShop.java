package p004_CicliIterativi;

import java.util.Scanner;

//Cerchiamo di vedere quello che abbiamo studiato fino ad ora creando
//un programma "Candy Shop"
//-->Abbiamo 100 caramelle da vendere al prezzo di 50 cent l'una
//-->I clienti arrivano uno dopo l'altro e possono comprare quante 
//caramelle vogliono (fino ad esaurimento).

public class C04_CandyShop {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int caramelle = 10;
		final double prezzo = 0.5;
		boolean verifica = true;

		while (caramelle > 0) {
			System.out.print("Sono disponibili ");
			System.out.print(caramelle);
			System.out.println(" caramelle.");
			System.out.println();

			System.out.println("Quante caramelle vuoi comprare?");
			int numeroCaramelle = input.nextInt();

			if (numeroCaramelle < 0) {
				System.out.println("Numero Errato");
			} else if (numeroCaramelle > caramelle) {
				numeroCaramelle = caramelle;
				System.out.print("Mi sono rimaste solo ");
				System.out.print(numeroCaramelle);
				System.out.print(" caramelle. Il prezzo è per queste è ");
				System.out.print(prezzo * numeroCaramelle);
				System.out.println("€");
				System.out.println();

				verifica = false;
			}

			caramelle -= numeroCaramelle;

			if (verifica) {
				System.out.print("Il prezzo è ");
				System.out.print(prezzo * caramelle);
				System.out.println("€");
				System.out.println();
			}
		}

		System.out.println("Caramelle Terminate.");
	}
}
