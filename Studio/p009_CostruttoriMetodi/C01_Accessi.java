package p009_CostruttoriMetodi;

/*
 * Abbiamo visto che si usano:
 * -->membri di istanza per codificare lo stato e le funzionalità dei singoli oggetti
 * -->membri statici per codificare lo stato e le funzionalità della classe:
 * - condivise da tutti gli oggetti
 * - significativi anche se non esiste nessun oggetto della classe
 * 
 * Il main è statico. In effetti  viene creato prima di aver creato qualunque oggetto.
 * 
 * -->una variabile dovrebbe essere di istanza se assume valori diversi 
 * per oggetti diversi
 * -->una variabie dovrebbe essere statica se assume gli stessi valori per oggetti diversi
 * 
 * Abbiamo visto anche che una dichiarazione di variabile o metodo (siano essi statici o no)
 * può essere preceduto da modificare di visibilità. In ordine crescente di visibilità:
 * 
 * 		PRIVATE --> visualizzabile solo all'interno della stessa classe
 * 		 
 * 		 SENZA
 * 	  MODIFICATORE --> visualizzabile solo all'interno dello stesso package che contiene
 * 						la classe
 * 
 * 	   PROTECTED --> utilizzabile nel package che contiene la classe e in tutte le classi
 * 					 che ereditano da essa.
 * 
 * 		PUBLIC --> utilizzabile ovunque.
 */

public class C01_Accessi {
	
	private int a;
    protected short b;
    static double c;
    // public long d;

    static {
        c = 18;
    }

    public C01_Accessi() {
        a = 42;
        b = 23;
    }

    
    public int f() {
        return a;
    }
    
    public void g() {
        a = 10;
        b = 10;
    }

}
