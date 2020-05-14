package Ereditarietà;

public class Studente extends Persona {

	private int matricola;
	private int anno;
	private static int ultimaMatricola = 0;

	// costruttore
	public Studente(String nome, String indirizzo) {

		// chiama il costruttore Persona
		// -->lo abbiamo già visto con this()
		super(nome, indirizzo);
		this.matricola = ultimaMatricola + 1;
		ultimaMatricola++;
		this.anno = 1;

	}

	/*
	 * super è un riferimento all'oggetto (come this) ma che consente di utilizzare
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
	 * sottoclasse la chiamata super() può essere omessa solo se: -->la superclasse
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

	public void visualizza() {
		System.out.println("     Nome: " + getNome());
		System.out.println("Indirizzo: " + getIndirizzo());
		System.out.println("Matricola: " + matricola);
		System.out.println("     Anno: " + anno);

		if (isFuoricorso())
			System.out.println("Lo studente " + matricola + " è fuoricorso.");
		else
			System.out.println("Lo studente " + matricola + " è in corso.");
		System.out.println();
	}

}
