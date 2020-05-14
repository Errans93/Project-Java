package p011_Eredit�;

/*
 * Ci� che si pu� fare ora � di ridefinire le classi Studente
 * e Professore come fossero estensioni della classe Persona.
 * Le clssi Studente e Professore erediteranno cos� i membri
 * di Persona (senza doverli definire di nuovo) --> Tali membri
 * saranno definiti una volta sola (in Persona).
 * 
 * Per definire una classe come estensione di un altra si deve
 * usare la primitiva extends --> deve essere usata all'inizio
 * della definizione della classe.
 * 
 * public class Studente extends Persona {
 * ---
 * }
 * 
 * Terminologia:
 * 
 * -->la classe che viene estesa (Persona) � detta SUPERCLASSE
 * -->la classe che estende (Studente) � detta SOTTOCLASSE
 * 
 * Ridefiniamo Studente
 */

public class Studente extends Persona {

	private int matricola;
	private int anno;
	private static int ultimaMatricola = 0;

	// costruttore
	public Studente(String nome, String indirizzo) {

		// chiama il costruttore Persona
		// -->lo abbiamo gi� visto con this()
		super(nome, indirizzo);
		this.matricola = ultimaMatricola + 1;
		ultimaMatricola++;
		this.anno = 1;

	}

	/*
	 * super � un riferimento all'oggetto (come this) ma che consente di utilizzare
	 * i costruttori e i metodi della superclasse. Ad es. dentro a Studente:
	 * 
	 * -->this() richiama un costruttore della classe Studente -->super() richiama
	 * un costruttore della classe Persona
	 * 
	 * Nota: come this() anche super() deve essere eseguito come primo comando di un
	 * costruttore.
	 * 
	 * In caso la chiamata super() venga omessa, viene invocato automaticamente il
	 * costruttore senza parametri della classe. Quindi, nel costruttore della
	 * sottoclasse la chiamata super() pu� essere omessa solo se: -->la superclasse
	 * prevede un costruttore senza parametri (es. un costruttore di default)
	 */

	public int getMatricola() {
		return matricola;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		if (anno > 1)
			this.anno = anno;

	}

	public boolean isFuoricorso() {
		return (anno > 5);
	}
	@Override
	public void visualizza() {
		System.out.println("     Nome: " + getNome());
		System.out.println("Indirizzo: " + getIndirizzo());
		System.out.println("Matricola: " + matricola);
		System.out.println("     Anno: " + anno);

		if (isFuoricorso())
			System.out.println("Lo studente " + matricola + " � fuoricorso.");
		else
			System.out.println("Lo studente " + matricola + " � in corso.");
		System.out.println();
		/*
		 * Il metodo visualizza di Studente e Professore richiede
		 * due osservazioni:
		 * 
		 * 1) Nome e indirizzo sono variabili private di Persona
		 * -->il fatto che Studente e Professore siano sottoclasse
		 * non le autorizzano ad accedere a variabili private
		 * 
		 * Conseguenze:
		 * -->devo usare i metodi pubblici (se disponibili, come in 
		 * questo caso)
		 * -->devo modificare il modificatore di visibilit� private
		 * di nome e indirizzo in Persona
		 * 
		 * 2) visualizza() era gi� stato definito in Persona
		 * -->questo � il caso di OVERRIDING di un metodo
		 * -->la sottoclasse ridefinisce (sostituendolo) un metodo
		 * della superclasse
		 * 
		 * Per ottenere l'overriding di un metodo � necessario che la 
		 * firma del metodo della sotto classe sia identica a quella del
		 * metodo della superclasse --> in caso contrario avremo un OVERLOADING
		 * -->entrambi i metodi (il vecchio e il nuovo) sarebbero
		 * abilitati ed invocati in base alla firma.
		 * 
		 * Quando vado a fare un Overriding di un metodo posso andare
		 * a scrivere sopra il metodo della sotto classe @Override in 
		 * modo che il compilatore sia sicuro che quel metodo sia lo stesso
		 * MA modificato.
		 * 
		 * ATTENZIONE:
		 * Override e Overload di metodi sono due cose molto diverse:
		 * - Overloading - � un meccanismo che consente di avere pi�
		 * metodi con lo stesso nome (ma con firma differente)
		 * 
		 * - Overriding - � un meccanismo che consente di sostituire
		 * un metodo della superclasse
		 */
	}
}
