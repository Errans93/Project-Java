package Learn;

public class Professore {

	private String nome; // nome e cognome
	private String indirizzo; // indirizzo
	private String codiceDocente; // numero del Docente
	private String dipartimento; // dipartimento di appartenenza

	public Professore(String nome, String indirizzo, String codiceDocente, String dipartimento) {
		this.nome = nome; // inizializzata la variabile privata private String nome; //nome e cognome
		this.indirizzo = indirizzo; // inizializzata la variabile privata private String indirizzo; //indirizzo
		this.codiceDocente = codiceDocente;
		this.dipartimento = dipartimento;

	}

	// fornisce il nome del professore
	public String getNome() {
		return nome;
	}

	// fornisce l'indirizzo del professore
	public String getIndirizzo() {
		return indirizzo;
	}

	// consente di modificare l'indirizzo
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	// fornisce codice del professore
	public String getCodiceDocente() {
		return codiceDocente;

	}

	// fornisce il dipartimento del professore
	public String getDipartimento() {
		return dipartimento;
	}
	
	//stampa le informazioni del professore
	public void visualizza() {
		System.out.println("        Nome: " + nome);
		System.out.println("   Indirizzo: " + indirizzo);
		System.out.println("      Codice: " + codiceDocente);
		System.out.println("Dipartimento: " + dipartimento);
		
		System.out.println();
	}
	
	
}
