package p004_CicliIterativi;

import java.util.Scanner;

//Spesso nei programmi si utilizzano cicli annidati (un ciclo
//all'interno di un altro ciclo).
//-->il ciclo interno viene ri-eseguito ad ogni iterazione del
//ciclo esterno

//Ovviamente si possono annidare for dentro for, while dentro for,
//while dentro while, etc...

public class C07_TavolaPitagorica {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero per il quale vuoi " + "calcolare la tabella pitagorica: ");
		int numero = input.nextInt();

		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= numero; j++) {
				System.out.print(" | ");
				System.out.print(i*j);
				
			}
			System.out.print(" | ");
			System.out.println();
		}
	}
}
