package p006_ClassiOggetti;

import java.util.Scanner;

//Primo esempio di uso di un array

public class C10_RipetoNumeri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//array che memorizza 10 variabili di tipo int
		int[] interi = new int[10];
		
		System.out.println("Inserisci 10 numeri interi: ");
		for (int i = 0; i < interi.length; i++) {
			System.out.print((i + 1) + ") ");
			interi[i] = input.nextInt();
			
		}
		System.out.println("I numeri da te inseriti sono: ");
		for (int i = 0; i < interi.length; i++) {
			System.out.println((i + 1) + ") " + interi[i]);
		}
		
	}

}
