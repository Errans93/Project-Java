package p004_CicliIterativi;

import java.util.Scanner;

//Quando siamo sicuri che il corpo di un ciclo debba essere eseguito 
//almeno una volta possiamo il comando do-while.

//--Andremo a modificare la classe C02_SommaNumeri in modo che continui
//a sommare numeri finchè l'utente non inserisce un numero negativo.

//Il comando do-while ha la seguente forma:
//do{--comando--} while(condizione)
//dove:
//-->la condizione è detta guardia del do-while
//-->la guardia può essere una qualunque espressione booleana
//-->il comando (o blocco) è detto corpo del do-while

//Semantica:
//1)il corpo viene eseguito
//2)la guardia viene valutata
//3)se la guardia è vera si rinizia dal punto 1)
//4)se la guardia è falsa si procede con l'istruzione dopo il while

public class C05_SommaNumeri {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double somma = 0;
		double numero; // Sono COSTRETTO a dichiararlo qua. Se lo dichiarassi
		// all'interno del blocco do non potrei usare questa variabile nella condizione
		// del while.

		System.out.println("Inserisci il primo numero della serie che vuoi sommare");

		do {
			if (somma != 0)
				System.out.println("Inserisci il prossimo numero della serie che vuoi sommare");
			
			numero = input.nextDouble();
			somma += numero;
		} while (numero > 0);
		System.out.println(somma);
	}
}
