package Ereditarietà_2;

public class Genitore extends Persona {

	private String mestiere;

	public Genitore(String nome, String indirizzo, String mestiere) {

		super(nome, indirizzo);
		this.mestiere = mestiere;

	}

	public String getMestiere() {
		return mestiere;
	}
@Override
	public void visualizza() {
		System.out.println("     Nome: " + getNome());
		System.out.println("Indirizzo: " + getIndirizzo());
		System.out.println("Dipartimento: " + mestiere);
		System.out.println();
	}

}
