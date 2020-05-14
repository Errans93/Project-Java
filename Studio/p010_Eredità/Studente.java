package p010_Eredità;

/*
 * Imparati i concetti di base, andiamo a sviluppare il nostro 
 * primo vero e proprio programma OOP.
 * 
 * A volte in un programma ci sono classi che descrivono cose
 *  simili tra di loro. Esempio:
 *  -->supponiamo di voler realizzare un programma per la gestione
 *   degli insegnamenti di un corso di laurea
 *  -->per gli insegnamenti vogliamo sapere chi è il docente responsabile
 *  e chi sono gli studenti frequentanti
 *  -->per descrivere studenti e docenti ci servono 2 classi:
 *  - Professore e Studente 
 */

public class Studente {

	private String nome;
	private String indirizzo;
	private int matricola;
	private int anno;
	private static int ultimaMatricola = 0;

	// costruttore
	public Studente(String nome, String indirizzo) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.matricola = ultimaMatricola + 1;
		ultimaMatricola++;
		this.anno = 1;

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
		System.out.println("     Nome: " + nome);
		System.out.println("Indirizzo: " + indirizzo);
		System.out.println("Matricola: " + matricola);
		System.out.println("     Anno: " + anno);

		if (isFuoricorso())
			System.out.println("Lo studente " + matricola + " è fuoricorso.");
		else
			System.out.println("Lo studente " + matricola + " è in corso.");
		System.out.println();
	}

}
