package p011_Eredità;

/*
 * Isolamo dunque i membri condivisi di Studente e Professore in una
 * classe nuova --> Persona.
 * Aggiungiamo anche un costruttore e un metodo visualizza();
 */

public class Persona {
	protected String nome;
	private String indirizzo;

	// costruttore
	public Persona(String nome, String indirizzo) {
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	public String getNome() {
		return nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void visualizza() {
		System.out.println("Nome: " + nome);
		System.out.println("Indirizzo: " + indirizzo);
		System.out.println();
	}


}
