package p006_ClassiOggetti;

/*
 * Un array è una sequenza di variabili di tipo omogeneo (tutte dello 
 * stesso tipo) distinguibili l'una dall'altra in base alla loro posizione
 * nell'array (all'interno della sequenza).
 * Il numero di elementi dell'array è detto lunghezza (o dimensione).
 */

public class C09_AboutArray {
	public static void main(String[] args) {

		// Dichiarazione di un array:
		// <tipo>[] <nome array>;

		int[] interi;
		double[] doubles;
		String[] stringhe;

		// Creazione di un array:
		// <nome array> = new <tipo>[<lunghezza>];

		interi = new int[10]; // interi è un array di 10 variabili di tipo int
		doubles = new double[10]; // doubles è un array di 10 variabili di tipo double
		stringhe = new String[10]; // stringhe è un array di 10 variabili di tipo String

		// dichiarazione e creazione possono essere abbinati:

		int[] numeri1 = new int[10]; // interi è un array di 10 variabili di tipo int
		double[] duobles1 = new double[10]; // doubles è un array di 10 variabili di tipo double
		String[] stringhe1 = new String[10]; // stringhe è un array di 10 variabili di tipo String

		/*
		 * NOTE: -->serve per alloccare (riservare) l'area di memoria che dovrà
		 * contenere i valori -->la lunghezza dell'array deve essere specificata in fase
		 * di creazione e non potrà cambiare -->un array è in realtà un oggetto per
		 * questo si ha new
		 * 
		 * Al momento della creazione tutti gli elementi sono inizializzati a: -->0 se
		 * il tipo è numerico -->false se è boolean -->null per array di oggetti
		 *
		 * Gli elementi di un array possono essere inizializzati in fase di
		 * dichiarazione:
		 */
		int[] elementi = { 1, 2, 3, 4, 5 };

		/*
		 * I singoli elementi di un array possono essere acceduti in lettura o in
		 * scrittura indicandone la posizione tra le parentesi. -->IL PRIMO ELEMENTO HA
		 * INDICE 0
		 */

		interi[0] = 0;
		interi[1] = 1;
		interi[2] = 2;
		interi[3] = 3;
		interi[4] = 4;
		interi[5] = 5;
		interi[6] = 6;
		interi[7] = 7;
		interi[8] = 8;
		interi[9] = 9;
		
		doubles[0] = 0.9;
		doubles[1] = 1.8;
		doubles[2] = 2.7;
		doubles[3] = 3.6;
		doubles[4] = 4.5;
		doubles[5] = 5.4;
		doubles[6] = 6.3;
		doubles[7] = 7.2;
		doubles[8] = 8.1;
		doubles[9] = 9.0;
		
		stringhe[0] = "Edoardo";
		stringhe[1] = "Errani";
		stringhe[2] = "Enrico";
		stringhe[3] = "Errani";
		stringhe[4] = "Alessandro";
		stringhe[5] = "Errani";
		stringhe[6] = "Alberto";
		stringhe[7] = "Errani";
		stringhe[8] = "Giulio";
		stringhe[9] = "Errani";
		

		int somma = interi[8] + interi[9];

		/*
		 * Se l'array ha dimensioni n (in questo caso = 10) l'indice tra parentesi deve
		 * essere compreso tra 0 e n - 1 (in questo caso n - 1 == 9).
		 * 
		 * -->La lunghezza di un array puo essere "scoperta" tramite l'attributo length
		 * (in questo caso non è un metodo)
		 */
		System.out.println("La unghezza dell'array interi è: " + interi.length);

	}
}