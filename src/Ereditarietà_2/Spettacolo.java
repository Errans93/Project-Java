package Ereditarietà_2;

public class Spettacolo {

	private String titolo;
	private String compagnia; // compagnia teatrale
	private String dataora;

	// array che contiene gli spettatori (classe persona)
	private Persona[] spettatori;

	// contatore dei posti prenotati
	private int postiPrenotati = 0;

	// costante condivisa che indica la capienza del teatro
	private static final int CAPIENZA = 10;

	// costruttore
	public Spettacolo(String titolo, String compagnia, String dataora) {
		this.titolo = titolo;
		this.compagnia = compagnia;
		this.dataora = dataora;

		// inizializza l'array (inizialmente pieno di null)
		this.spettatori = new Persona[CAPIENZA];
	}

	// restituscie il numero di posti disponibili
	public int postiDisponibili() {
		return CAPIENZA - postiPrenotati;
	}

	// consente di prenotare un nuovo posto
	// restituisce false se i posti non sono disponibili
	public boolean prenota(Persona spettatore) {
		if (postiDisponibili() > 0) {
			spettatori[postiPrenotati] = spettatore;
			postiPrenotati++;
			return true;
		} else
			return false;
	}

	public void esaurito(Persona spettatore, boolean prenotaz) {
		if (!prenotaz) {
			System.out.println(" Il Biglietto non può essere venduto perchè i biglietti sono esauriti. " + spettatore.getNome());
		}
	}

	// stampa l'elenco delle prenotazioni
	public void stampaPrenotazioni() {
		System.out.println("Spettacolo: " + titolo);
		System.out.println("Del " + dataora);
		System.out.println();

		for (int i = 0; i < postiPrenotati; i++) { // perchè parto da zero
			spettatori[i].visualizza();
		}
	}
}
