package p007_ProgrammazioneOrientOggetti;

/*
 * Abbiamo visto come programmare utilizzando i seguenti tipi di dato:
 * -->Tipi primitivi (int, double, char, boolean..)
 * -->Stringhe
 * -->Array
 * 
 * I programmi fatti fino ad ora consentivano di una sequenza di:
 * -->comandi
 * strutture di controllo (cicli, scelte condizionali, etc..)
 * -->ed eventualmente di metodi ausiliari - che consentivano di 
 * manipolare i dati per calcolare il risultato voluto.
 * 
 * Questo modo di programmare prende il nome di PROGRAMMAZIONE IMPERATIVA
 * (in quanto basata su comandi).
 * 
 * Nella programmazione imperativa:
 * -->un programma prevede uno STATO GLOBALE costituito dai valori
 * delle variabili
 * -->i  comandi del programma modificano lo stato fino a raggiungere
 * uno stato finale (che include il risultato).
 * 
 * Sebbene sua possibile scrivere programmi interessanti con i tipi di
 * dato visti fino ad ora, spesso i programmi hanno bisogno di manipolare 
 * strutture dati che rappresentino più fedelmente le entità del mondo
 * reale.
 * Ad esempio pensiamo di dover scrivere programmi per la gestione di:
 * Conti bancari --> ogni conto bancario ha un proprio saldo, un proprio
 * 					 intestatario, una propria vista di movimenti...
 * Dipendenti --> ogni dipendente di un'azienda ha una propria matricola,
 * 				  un proprio stipendio, un proprio orario di lavoro...
 * Rettangoli --> ogni rettangolo ha una propria base, un'altezza e 
 * 				  una posizione nel piano.
 * 
 * Scrivere programmi di questo tipo usando interi,
 * array e stringhe può diventare abbastanza complicato.
 * Da notare che ogni entità del mondo reale (come il conto bancario)
 * prevede un proprio stato interno (come il saldo in questo caso)
 * e delle proprioìe funzionalità (versamento, prelievo..).
 * Per questp motivo il linguaggio di programmazione orientsto agli 
 * oggetti fornisce meccanismi per definire nuovi tipi di dato basati
 * sul concetto di classe.
 * 
 *  Una classe definisce un INSIEME DI OGGETTI (conti bancari, dipendenti,
 *  automobili, rettangoli...).
 *  Un oggetto è una struttura dotata di:
 *  -->proprie variabili (che rappresentano il suo stato)
 *  -->propri metodi (che realizzano le sue funzionalità)
 */

public class C01_UsaConto {
	public static void main(String[] args) {

		// Creo un nuovo conto corrente (cc) iniziallizzato con 1000 euro
		C01_ContoCorrente cc = new C01_ContoCorrente(1000);

		// verso 200 euro nel mio conto
		cc.versa(200);

		// Faccio un paio di prelevi controllondo se ho soldi nel mio conto
		if (cc.saldo > 200)
			cc.preleva(300);
		
		do {
			cc.preleva(10);
		} while (cc.saldo >= 41);

		System.out.println("Saldo finale: " + cc.saldo + "€");
		
		//cc.versa() è un invocazione di un metodo (cc.preleva())
		//cc.saldo() è la lettura di una variabile
	}
}
