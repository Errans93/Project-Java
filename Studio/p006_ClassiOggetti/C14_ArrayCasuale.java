package p006_ClassiOggetti;

import java.util.Random;

/*
 * Gli oggetti della classe Random del pacchetto java.util prevedono
 * numerosi metodi per generare nummeri casuali. Tra questi, il metodo
 * nextInt(num); che genera un numero tra 0 (compreso) e nume (escluso).
 * 
 * Qui realizzeremo una classe che prevede tre metodi  ausiliari:
 * -->generaArray() - che restituisce un array di n elementi inizializzato
 *  con numeri tra 0 e 100
 *  -->stampaArray(n) - stampa l'array generato
 *  -->sommaTutti(a) - che restituisce la somma di tutti gli elementi a
 *  
 *  Il metodo main deve utilizzare i metodi ausiliari per generare un array
 *  di 10 elementi dei quali quali stamperà la somma.
 */

public class C14_ArrayCasuale {
	public static void main(String[] args) {

		int[] arrayCasuale = generaArray();

		for (int num : arrayCasuale) {
			stampaArray(num);
		}

		int somma = sommaTutti(arrayCasuale);
		System.out.println("La somma di tutti i membri dell'array è: " + somma);
	}

	private static int[] generaArray() {

		int[] ris = new int[10];
		for (int i = 0; i < ris.length; i++) {
			Random rand = new Random();
			ris[i] = rand.nextInt(100);
		}
		return ris;
	}

	private static void stampaArray(int n) {
		System.out.println("Stampo: " + n);
	}

	private static int sommaTutti(int[] array) {
		int somma = 0;
		for (int i = 0; i < array.length; i++) {
			somma += array[i];
		}
		return somma;
	}
}
