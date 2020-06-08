package Learn;

public class Studente {

	private String nome; // nome e cognome
	private String indirizzo; // indirizzo
	private String facoltà;
	private int matricola; // nunero di matricola
	private int anno; // anno di appartenenza
	private static int ultimaMatricola = 0; // variabile statica

	// costruttore

	public Studente(String nome, String indirizzo) {
		this.nome = nome; // inizializzata la variabile privata private String nome; //nome e cognome
		this.indirizzo = indirizzo; // inizializzata la variabile privata private String indirizzo; //indirizzo

		// genera la matricola usando la variabile statica
		this.matricola = ultimaMatricola + 1;
		ultimaMatricola++;

		// si assume che un nuovo studente sia al primo anno

		this.anno = 1;
		this.facoltà = "defalut";
	}
	
	//fornisce la facoltà dello studente
	public String getFacoltà() {
		return facoltà;
	}
	
	//Imposta la facoltà dello studente
	public void setFacoltà(String facoltà) {
		this.facoltà = facoltà;
	}

	// fornisce il nome dello studente
	public String getNome() {
		return nome;
	}

	// fornisce l'indirizzo dello studente
	public String getIndirizzo() {
		return indirizzo;
	}

	// consente di modificare l'indirizzo
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	// fornisce la matricola
	public int getMatricola() {
		return matricola;
	}

	// fornisce l'anno di frequentazione
	public int getAnno() {
		return anno;
	}

	// modifica l'anno di frequentazione
	public void setAnno(int anno) {
		if (anno > 1)
			this.anno = anno;

	}

	// verifica se lo studente  è fuoricorso
	public boolean isFuoricorso() {
		return (anno > 5);
	}

	// stampa le informazioni sullo studente
	public void visualizza() {
		System.out.println("     Nome: " + nome);
		System.out.println("Indirizzo: " + indirizzo);
		System.out.println("Matricola: " + matricola);
		System.out.println("     Anno: " + anno);
		System.out.println("  Facoltà: " + facoltà);
		if (isFuoricorso())
			System.out.println("Lo studente " + matricola + " è fuoricorso.");
		else
			System.out.println("Lo studente " + matricola + " è in corso.");
		System.out.println();
	}
}
