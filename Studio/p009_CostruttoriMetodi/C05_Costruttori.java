package p009_CostruttoriMetodi;

/*
 * I costruttori si dichiarano all'interno di una classe essenzialmente
 * come i metodi, ma rispettando le seguenti regole:
 * -->il nome del costruttore coincide con quella della classe
 * -->il tipo del costruttore non deve essere mai specificato
 * -->il modificatore static non può essere usato per un costruttore
 * 
 * Come per i metodi, anche ai costruttori si applica l'overloading (si 
 * vedrà piu avanti in dettaglio, ci basti sapere che più metodi si possono
 * chiamare alla stessa maniera avendo però due firme diverse (firma =
 * <nome metodo>(<tipo 1>, ... ,<tipo n>)).
 * -->una classe può avere più costruttori purché abbiano firma
 * diversa (ciè i parametri formali devono differire nel tipo e/o
 * nel numero)
 */

public class C05_Costruttori {

	double ex;

	public C05_Costruttori(double esempio) {
		ex = esempio;
	}

	
	/*
	 * Ogni classe ha un costruttore di default che inizializza le 
	 * variabili di istanza con il corrispondente valore di default.
	 * Questo costruttore non ha parametri, ed è disponibile SOLO
	 * se nella classe non è definito nessun costruttore.
	 * Se invece nella classe è definito almeno un costruttore, allora il
	 * costruttore di default non è più utilizzabile.
	 * 
	 * Nel nostro caso il costruttore di default non sarebbe utilizzabile.
	 * Se nel main provo a scrivere:
	 * 
	 * C05_Costruttori cos = new C05_Costruttori(); -->ERRORE
	 * 
	 * dovrò scrivere:
	 * 
	 * C05_Costruttori cos = new C05_Costruttori(12.0);
	 * 
	 * Se il programma vuole continuare a rendere disponibile un 
	 * costruttore che non prevede parametri, deve implementarlo:
	 */
	
	public C05_Costruttori() {
	}
	
	/*
	 * Questa volta si possono usare entrambi i costruttori:
	 * 
	 * C05_Costruttori cos = new C05_Costruttori();
	 * 
	 * C05_Costruttori cos = new C05_Costruttori(12.0);
	 */

}
