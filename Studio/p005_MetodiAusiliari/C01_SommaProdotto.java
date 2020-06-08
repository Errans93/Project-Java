package p005_MetodiAusiliari;

import java.util.Scanner;

//Fino ad ora abbiamo realizzato programmi costituiti da un solo metodo (il main).
//Quando il programma da realizzare diventa più articolato conviene:
//-->identificare SOTTOPROBLEMI che possono essere risolti individualmente
//-->scrivere SOTTOPROGRAMMI che risolvono i SOTTOPROBLEMI
//-->richiamare i SOTTOPROGRAMMI dal programma principale (main)

//Questo approccio viene chiamato programmazione PROCEDURALE. In Java i SOTTOPROGRAAMI
//si realizzano tramite metodi ausiliari.

//ESEMPIO:
//Somma e prodotto dei primi 10 numeri naturali > scriveremo un programma SommaProdotto
//che calcola a scelta dell'utente, la somma o il prodotto dei numeri naturali 
//che vanno da 1 a 10 

//SOTTOPROBLEMI:
//-->Calcolare la somma
//-->Calcolare il prodotto

//SOTTOPROGRAMMI:
//-->somma
//-->prodotto

//Definizione del metodo ausiliario somma (il metodo prodotto è analogo)

//		private static int somma() {
//			int ris = 0;
//			for (int i = 1; i <= 10; i++){
//				ris += i;
//			}
//			return ris;
//		}

//-->private significa che si tratta di un metodo ausiliario (di aiuto a un altro
//metodo della stessa classe e non utilizzabile da altre classi)
//-->static si capirà più avanti
//-->int è il tipo di risultato calcolato dal metodo
//-->somma è il nome del metodo (è un identificatore e valgono le stesse
//regole sintattiche delle variabili)
//-->le parentesi le capireo tra poco
//-->return è un comando che termina l'esecuzione del metodo e fornisce il risultato.

public class C01_SommaProdotto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserire (1) per la somma (2) per il prodotto");
		int scelta = input.nextInt();
		int risultato;

		if (scelta == 1) {

			risultato = somma();
			System.out.println(risultato);
			
			//La chiamata (o invocazione) di un metodo è un'ESPRESSIONE:
			//-->il tipo di tale espressione è il tipo del risultato del metodo
			//-->il valore di tale espressione è il valore restituito dal metodo
			
			//Avremmo anche potuto semplificare il programma scrivendo direttamente:
			//		System.out.println(somma()); 
			
		} else if (scelta == 2) {
			risultato = prodotto();
			System.out.println(risultato);
		} else
			System.out.println("ERRORE DI INSERIMENTO");

	}

	// METODO SOMMA
	private static int somma() {
		int ris = 0;
		for (int i = 1; i <= 10; i++) {
			ris += i;
		}
		return ris;
	}

	// METODO PRODOTTO
	private static int prodotto() {
		int ris = 1;
		for (int i = 1; i <= 10; i++) {
			ris *= i;
		}
		return ris;
	}
}
