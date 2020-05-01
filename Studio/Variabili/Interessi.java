package Variabili;

//Inquesto esempio alcune variabili sono state inizializzate nella dichiarazione.
//--> Le variabili hanno tipo  double 
//--> Le variabili cambiano valore durante l'esecuzione
//--> Il nuovo valore di una variabile può essere calcolato a 
//partire dal precente (capitale= capitale+interesse;).
//Nella dichiarazione che nn devono mai cambiare valore si può 
//utilizzare il modificatore "final"..ì Questo modificatore trasforma 
//la variabile in costante.

public class Interessi {

	public static void main(String[] args) {

		double capitale = 1000;
		final double tasso = 0.05;
		double interesse;

		// calcolo'interesse maturato dopo un anno
		interesse = capitale * tasso;
		capitale = capitale + interesse;

		// calcolo'interesse maturato dopo due anni
		interesse = capitale * tasso;
		capitale = capitale + interesse;

		// calcolo'interesse maturato dopo tre anni
		interesse = capitale * tasso;
		capitale = capitale + interesse;

		// Stampo
		System.out.print("Capitale maturato: ");
		System.out.print(capitale);

	}
}
