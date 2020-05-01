package Variabili;

//Introducendo le variabili base e altezza il programma 
//risulta essere più chiaro:
//--> si capisce meglio quale sia la base e quale l'altezza
//--> si capisce meglio cosa stia calcolando il programma

public class AreaTriangolo2 {

	public static void main(String[] args) {

		// Ogni variabile (base, altezza, area) deve essere
		// dichiarata prima del suo utilizzo. Nella dichiarazione
		// di una variabile si specificano il nome e il tipo (il tipo
		// di valori che può contenere).
		int base;
		int altezza;
		int area;

		// Tramite l'assegnamento si memorizza un valore in una variabile.
		// Il valore di una variabile può essere un letterale o il risultato
		// della valutazione di un'espressione (es.: area = base*altezza/2).
		base = 5;
		altezza = 10;
		area = base * altezza / 2;

		System.out.println(area);

		// Prima di opter essere usata (o letta) in un'espressione una
		// variabile deve:
		// --> essere dichiarata
		// --> essere stata assegnata almeno una volta (inizializzata)
		// Si può anche combinare dichiarazione e assegnamento
		// (dichiarazione con inizializzazione):

		int base1 = 5;
		int altezza1 = 10;
		int area1 = base * altezza / 2;

		System.out.println(area1);

	}

}
