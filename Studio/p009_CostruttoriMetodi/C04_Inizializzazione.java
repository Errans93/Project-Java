package p009_CostruttoriMetodi;

/*
 * Abbiamo visto due tipi di variabili in Java:
 * -->variabili dichiarate localmente nei metodi (o costruttori):
 * variabili locali o parametri formali
 * 
 * -->variabili dichiarate come membri di una classe:
 * variabili statiche o di istanza
 * 
 * Le variabili locali dei metodi:
 * -->vengono alloccate nel record di attivazione relativo alla
 * chiamata del metodo (nello stack).
 * -->devono essere inizializzate esplicitamente, altrimenti
 * il compilatore segnala un errore
 * 
 * la variabili di istanza o statiche:
 * -->vengono alloccate nell'area di memoria che descrive l'oggetto
 * (nello heap)
 * -->vengono sempre inizializzate anche se non viene fatto
 * esplicitamente
 * 
 * I valori di default di queste variabili sono:
 * -->0 - per le variabili numeriche
 * -->false - per le variabili di tipo boolean
 * -->null - per le variabili di tipo classe (oggetti)
 * 
 * Ci sono 3 modi per inizializzare una variabile statica o di istanza:
 * 1) con l'assegnamento esplicito all'interno di un costruttore
 * 2)con l'inizializzazione nella dichiarazione
 * 3)inizializzazione (implicita) con i valori di default
 */

public class C04_Inizializzazione {

	public int i; // 0
	public boolean flag; // false
	public String t; // null

	public double x;
	public double y = 3;
	public double z;

	public C04_Inizializzazione(double val, int value) {

		x = val;
		i = value;
	}

}
