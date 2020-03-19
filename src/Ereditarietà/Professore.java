package Ereditarietà;

public class Professore extends Persona {

	private String codiceDocente;
	private String dipartimento;

	public Professore(String nome, String indirizzo, String codiceDocente, String dipartimento) {
		super(nome, indirizzo);
		this.codiceDocente = codiceDocente;
		this.dipartimento = dipartimento;

	}

	public String getCodiceDocente() {
		return codiceDocente;

	}

	public String getDipartimento() {
		return dipartimento;
	}

	@Override
	public void visualizza() {
		System.out.println("        Nome: " + nome);
		System.out.println("   Indirizzo: " + getIndirizzo());
		System.out.println("      Codice: " + codiceDocente);
		System.out.println("Dipartimento: " + dipartimento);

		System.out.println();
	}
}
