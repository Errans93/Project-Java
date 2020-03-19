package Ereditariet�;

public class Studente extends Persona {

	private String facolt�;
	private int matricola;
	private int anno;
	private static int ultimaMatricola = 0;

	// costruttore
	public Studente(String nome, String indirizzo) {
		super(nome, indirizzo);
		this.matricola = ultimaMatricola + 1;
		ultimaMatricola++;
		this.anno = 1;
		this.facolt� = "defalut";
	}

	public String getFacolt�() {
		return facolt�;
	}

	public void setFacolt�(String facolt�) {
		this.facolt� = facolt�;
	}

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
		System.out.println("  Facolt�: " + facolt�);
		if (isFuoricorso())
			System.out.println("Lo studente " + matricola + " � fuoricorso.");
		else
			System.out.println("Lo studente " + matricola + " � in corso.");
		System.out.println();
	}

}
