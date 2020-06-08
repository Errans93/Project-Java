package p007_ProgrammazioneOrientOggetti;

/*
 * HIGHLIGHTS:
 * Riprendiamo l'esempio del C01_ContoCorrente e  del
 * C01_UsaConto e arricchiamo il comportamento dei metodi
 * e tracciamo i movimenti stampando dei messaggi.
 */

public class C03_ContoCorrente {
	
public double saldo;
	
	//Costruttore della classe
	public C03_ContoCorrente (double saldoIniziale) {
		//Saldo iniziale == 1000. Lo inizializzo nel main.
		saldo = saldoIniziale;
	}
	
	public void versa(double somma) {
		saldo += somma;
		System.out.println("Versati: " + somma + "è");
	}
	
	public void preleva(double somma) {
		saldo -= somma;
		System.out.println("Prelevati: " + somma + "è");
	}

}
