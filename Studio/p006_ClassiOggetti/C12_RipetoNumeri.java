package p006_ClassiOggetti;

import java.util.Scanner;

/*
 * Modifichiamo la classe C10_RipetoNumeri usando il comando for-each
 */

public class C12_RipetoNumeri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// array che memorizza 10 variabili di tipo int
		int[] interi = new int[10];

		System.out.println("Inserisci 10 numeri interi: ");
		for (int i = 0; i < interi.length; i++) {
			System.out.print((i + 1) + ") ");
			interi[i] = input.nextInt();

		}
		System.out.println("I numeri da te inseriti sono: ");
		for (int i : interi) {
			System.out.println(i);
		}
		
		/*
		 * Perch� non ci sono due for-each?
		 * Il comando for-each pu� essere usato sono quando l'indice degli 
		 * elementi non � importante. Quando l'indice � importante, bisogna 
		 * usare il for tradizionale.
		 */

	}
}
