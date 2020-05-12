package p007_ProgrammazioneOrientOggetti;

/*
 * Osservazioni:
 * Questa classe non � molto diversa daiprogrammi che abbiamovisto fino ad ora.
 * 
 * Non c'� il mani (ce n'� solo uno per tutto il programma).
 * C'� una variabile (saldo) che rappresenta lo stato del conto.
 * 
 * ci sono due metodi (versa() e preleva()) che descrivono le funzionalit�
 * del conto.
 * C'� un metodo speciale (C01_ContoCorrente()) che inizializza il conto. Questo
 * metodo � detto COSTRUTTORE e viene richiamato quando si ha il comando new (non
 * prevede tipo di ritorno).
 * I metodi e le variabili sono public quindi possono essere usati anche da altre
 * classi (UsaConto).
 */

public class C01_ContoCorrente {

	public double saldo;
	
	//Costruttore della classe
	public C01_ContoCorrente (double saldoIniziale) {
		//Saldo iniziale == 1000. Lo inizializzo nel main.
		saldo = saldoIniziale;
	}
	
	public void versa(double somma) {
		saldo += somma;
	}
	
	public void preleva(double somma) {
		saldo -= somma;
	}
}
