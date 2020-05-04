package p004_CicliIterativi;

import java.util.Scanner;

//Quante iterazioni fa un ciclo?

//Nel programma Candy shop il numero di iterazioni dipende da
//quante caramelle compra ad ogni passo l'utente.

//-->Iterazione indeterminata -> corro finch� ho fiato.

//In altri casi il numero di iterazioni � noto a priori. Es:
//i C01_SommaNumeri si chiede all'utente quanti numeri voglia 
//sommare, e il numero inserito diventa esattamente il numero 
//di iterazioni del ciclo.

//-->Iterazione determinata -> corro dieci giri di campo.

//Quando il numero di iterazioni � noto a priori, anzich� del while 
//possiamo utilizzare il for. Il comando for ha la seguente forma:

//	for (comando iniziale; condizione; comando di aggiornamento)
//	---corpo---

//dove:
//-->il comando iniziale � un comando eseguito all'inizio del ciclo
//-->la condizione � la guardia del for
//-->comando di aggiornamento �  un comando eseguito ad ogni iterazione
//-->il corpo pu� essere un singolo comando o un blocco

//Semantica
//1)Viene eseguito il comando iniziale
//2)la guardia viene valutata
//3)se la guardia � vera:
//	->si esegue il corpo
//	->si esegue il comando di aggiornamento
//	->si ricomincia da 2) (non da 1))
//4)se la guardia � falsa si salta il corpo e si procede con l'istruzione
//seguente al for

//NOTE:

//Nel ciclo:
//		for (int i = 0; i < 10; i++)
//			System.out.println(i);
//-->la variabile i � locale al ciclo for
//-->la sua visibilit� � limitata al for
//-->� buona norma non modificare i all'interno del ciclo
//-->posso riutilizzare i in un for successivo (dichiarandola e inizializzandola)

//I nomi i, j e k sono usati comunemente per le vasriabili contatore dei cicli for.

public class C06_SommaNumeri {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Quanti numeri vuoi sommare?");
		int numero = input.nextInt();

		double somma = 0;

		System.out.println("Primo numero: ");
		for (int i = 0; i < numero; i++) {
			if (i == 0) {
				double num = input.nextDouble();
				somma += num;
			} else {
				System.out.println("Prossimo numero: ");
				double num = input.nextDouble();
				somma += num;
			}
		}

		System.out.print("Il risultato �: ");
		System.out.println(somma);
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		//Nel ciclo for si possono inserire pi� comandi di inizializzazione e aggiornamento
		//utilizzando la virgola. ESEMPIO:
		
		for (int i = 0, j = 0; i < somma; i++, j += i) {
			System.out.print("Stampo i: ");
			System.out.println(i);
			System.out.print("Stampo j: ");
			System.out.println(j);
		}
	}

}
