package Ereditariet�_2;

public class Figlio extends Persona {

	private boolean studente;
	String risposta;

	// costruttore
	public Figlio(String nome, String indirizzo, boolean studente) {
		super(nome, indirizzo);
		this.studente = studente;
		this.risposta = "si";

	}

	public void checkRisposta(String risposta) {
		this.risposta = risposta;
	}

	public boolean isStudente() {
		String check = "si";
		return check.equals(risposta);
	}

	@Override
	public void visualizza() {
		System.out.println("     Nome: " + getNome());
		System.out.println("Indirizzo: " + getIndirizzo());

		if (isStudente())
			System.out.println(getNome() + " � studente. " + " Paga meno il biglietto");
		else
			System.out.println(getNome() + " non � studente. E non avr� lo sconto per gli studenti");
		System.out.println();
	}

}
