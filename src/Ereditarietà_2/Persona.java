package Ereditarietà_2;

public class Persona {
	protected String nome;
	private String indirizzo;

	// costruttore
	public Persona(String name, String indirizzo) {
		this.nome = name;
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
		System.out.println("Name: " + nome);
		System.out.println("Indirizzo: " + indirizzo);
	}
}
