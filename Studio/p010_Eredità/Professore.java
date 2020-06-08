package p010_Eredità;

public class Professore {
	private String nome;
	private String indirizzo;
	private String codiceDocente;
	private String dipartimento;

	public Professore(String nome, String indirizzo, String codiceDocente, String dipartimento) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.codiceDocente = codiceDocente;
		this.dipartimento = dipartimento;

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

	public String getCodiceDocente() {
		return codiceDocente;

	}

	public String getDipartimento() {
		return dipartimento;
	}

	public void visualizza() {
		System.out.println("        Nome: " + nome);
		System.out.println("   Indirizzo: " + indirizzo);
		System.out.println("      Codice: " + codiceDocente);
		System.out.println("Dipartimento: " + dipartimento);

		System.out.println();
	}
}
