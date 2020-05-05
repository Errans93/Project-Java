package p006_ClassiOggetti;

/*
 * Molte classi della libreria standard di Java si usano per creare oggetti.
 * Questa è la  caratteristica più importante di java (e di tutti gli altri
 * linguaggi di programmazione orientati agli oggetti).
 * 
 * Un oggetto è un istanza di una classe:
 * -->un oggetto può possedere un proprio stato interno
 * -->la CLASSE specifica i metodi che possono essere invocati sull'oggetto
 * (metodi di istanza, specificano il comportamento dell'oggetto).
 * 
 * La relazione tra classi e oggetti è la seguente:
 * una classe definisce UN TIPO (non primitivo) i cui valori sono oggetti.
 * 
 * La classe STRING
 * 
 * Contiene metodi per l'elaborazione di stringhe. La chiamata di un metodo
 *  su un oggetto ha la seguente sintassi:
 *  
 *  <nomeOggetto>.<nomeMetodo>(<parametri>);
 */

public class C02_AboutString {
	public static void main(String[] args) {

		String nome = new String("Mario");
		String cognome = new String("Rossi");
		/*
		 * Le variabili nome e cognome: -->sono due oggetti di tipo String -->sono due
		 * istanze della classe String -->hanno stati interni diversi ("Mario", "Rossi")
		 * 
		 * Per creare un oggetto si usa la parola chiave new: -->new è seguito dalla
		 * chiamata a un costruttore della classe (un metodo speciale che ha lo stesso
		 * nome della classe e inizializza il nuovo oggetto).
		 * 
		 * La classe String in realtà è speciale. I suoi oggetti possono essere creati
		 * anche così:
		 */
		String s = "hello";
		String t = "world";
		String u = "or";

		// Ecco alcuni tra i metodi più comuni che si possono invocare su oggetti di
		// tipo String

		//Concateno la variabile s con t e con u
		System.out.println("s, t, u: " + s + ", " + t + ", " + u);

		//Questo metodo mi ritorna il carattere in posizione i (String.charAt(i);)
		System.out.println("char at position 1 in s: " + s.charAt(1));

		//Questo metodo mi restituisce:
		//un valore minore di 0 se s precede t lessicograficamente
		// un valore maggiore di 0 se t s lessicograficamente
		//il valore 0 se sono uguali
		System.out.println("s < t: " + s.compareTo(t));
		System.out.println("t > s: " + t.compareTo(s));

		//Concateno s e t
		System.out.println("concat s and t: " + s.concat(t));

		//Questo metodo mi restituisce:
		//true se la variabile t contiene la variabile u (in altre parole
		//se nella parola "world" c'è la parola "or")
		System.out.println("t contains u? " + t.contains(u));

		//Questo metodo restituisce la porzione di stringa che va dal 
		//carattere in posizione i al carattere in posizione j escluso
		String u2 = t.substring(1, 3);//String.substring(i, j);
		System.out.println("u2 = t.substring(1, 3): " + u2);
		
		//Questo metodo restituisce la porzione di stringa che va dal 
		//carattere in posizione i alla fine della stringa
		System.out.println("t.substring(3): " + t.substring(3)); //String.substring(i);

		//Questi due metodi li vedremo tra poco. Per adesso ci basti pensare che per le 
		//stringhe l'operatore di confronto == non funziona e quindi abbiamo bisogno di 
		//un metodo per compararle
		System.out.println("u equals u2? " + u.equals(u2));
		System.out.println("u == u2? " + (u == u2));

		//Questo metodo restituisce la posizione della prima occorrenza del 
		//carattere 'l' nella stringa s oppure -1 se non presente
		System.out.println("First index of 'l' is s: " + s.indexOf('l'));
		System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
		System.out.println("there is no 'x' in s: " + s.indexOf('x'));
		System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
		System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

		//Questo metodo restituisce:
		//true se la stringa è vuota
		//false se la stringa esiste
		System.out.println("check if an empty string is empty: " + "".isEmpty());
		
		//Questo metodo restituisce la lunghezza di una stringa
		System.out.println("s length: " + s.length());

		//Questo metodo restituisce una stringa dove (in questo caso) le sono state cambiate
		//tutte le "l" con le "q". NOTA: 'l' e 'q' sono caratteri e anche questi li vedremo tra poco.
		String s2 = s.replace('l', 'q');
		System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

		//Questo metodo restituisce una stringa con solo maiuscole
		System.out.println("upper: " + s.toUpperCase());
		
		//Questo metodo restituisce una stringa con solo minuscole
		System.out.println("lower: " + "SHUT UP!".toLowerCase());

	}

}
