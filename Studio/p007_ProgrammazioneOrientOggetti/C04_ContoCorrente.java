package p007_ProgrammazioneOrientOggetti;

/*
 * Modifiche all'interfaccia pubblica richiedono invece di modificare
 * il chiamante (in questo caso il main).
 * 
 * -->consentiamo il prelievo solo se c'è disponibilità
 */

public class C04_ContoCorrente {

	public double saldo;

	// Costruttore della classe
	public C04_ContoCorrente(double saldoIniziale) {
		// Saldo iniziale == 1000. Lo inizializzo nel main.
		saldo = saldoIniziale;
	}

	public void versa(double somma) {
		saldo += somma;
		System.out.println("Versati: " + somma + "è");
	}

	// Restituisce false se non ci sono abbastanza soldi
	//Bisogna modificare di conseguenza anche il main
	public boolean preleva(double somma) {

		if (saldo < somma) {
			System.out.println("Non ci sono abbastanza soldi");
			return false;
		} else {
			saldo -= somma;
			System.out.println("Prelevati: " + somma + "è");
		}
		return true;
	}
}
