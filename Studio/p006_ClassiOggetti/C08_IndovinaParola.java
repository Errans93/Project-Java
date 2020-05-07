package p006_ClassiOggetti;

import java.util.Scanner;

/*
 * Per dire se due stringhe sono uguali non si può usare ==.
 * Questo vale in generale per tutti gli oggetti. 
 * == confronterebbe l'indirizzo di memoria dei due oggetti.
 * La classe String fornisce metodi per confrontare stringhe:
 * -->s1.equals(s2) - restituisce true se s1 e s2 sono uguali
 * (stessa sequenza di caratteri), e false altrimenti
 * 
 * --s1.compareTo(s2) - restituisce un valore minore di 0 se s1
 * precede s2 lessicograficamente; un valore maggiore di 0 se s2 
 * precede s1 lessicograficamente; il valore 0  se s1 e s2 sono 
 * uguali.
 * 
 *  L'ordine leccicografico è simile all'ordine alfabetico, con la 
 *  differenza che nessun simbolo è ignorato (spazi, accenti, apostrofi...)-
 */

public class C08_IndovinaParola {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String parolaMisteriosa = "mistero";
		boolean verifica = false;
		int tentativi = 0;
		int i = 0;
		char carattere;
		String palabra = "";

		do {
			carattere = parolaMisteriosa.charAt(i);

			if (i == 0)
				System.out.println("Inserisci la parola che credi che sia sapendo che inizia per: " + carattere);
			else
				System.out.println("Inserisci la parola che credi che sia sapendo che: " + palabra + carattere);

			String indovina = input.next();

			if (parolaMisteriosa.equals(indovina)) {
				System.out.println("Hai indovinato la parola!");
				verifica = true;
			} else {
				System.out.println("Sbagliato!");
				palabra = palabra + carattere;
				tentativi++;
				i++;
			}

			if (parolaMisteriosa.compareTo(indovina) < 0)
				System.out.println("La parola misteriosa precede " + indovina);
			else
				System.out.println("La parola misteriosa segue " + indovina);
				
		} while (!verifica && tentativi < parolaMisteriosa.length());
		
		if (!verifica)
			System.out.println("Hai finito i tentativi!!");
	}
}
