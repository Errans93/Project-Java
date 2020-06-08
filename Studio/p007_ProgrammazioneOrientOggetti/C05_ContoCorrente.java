package p007_ProgrammazioneOrientOggetti;

/*
 * Se vogliamo evitare che il saldo sia modificabile dall'esterno
 *  della classe lo dobbiamo trasformare in privato (privat).
 */

public class C05_ContoCorrente {

	private double saldo;

	// Costruttore della classe
	public C05_ContoCorrente(double saldoIniziale) {
		// Saldo iniziale == 1000. Lo inizializzo nel main.
		saldo = saldoIniziale;
	}

	public void versa(double somma) {
		saldo += somma;
		System.out.println("Versati: " + somma + "è");
	}

	// Restituisce false se non ci sono abbastanza soldi
	// Bisogna modificare di conseguenza anche il main
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
	
	//Restituisce il saldo a chi ne ha bisogno
	public double visualizzaSaldo() {
		return saldo;
	}
	
	/*
	 * Quest'ultimo metodo consente di accedere al saldo "in lettura".
	 * In questo modo il valore del saldo è sempre sotto controllo
	 * dei metodi.
	 * La proprietà per cui i dati che rappresentano
	 * lo stato interno di un oggetto possono essere accessibili
	 * solo tramite i metodi dell'oggetto stesso è detta INCAPSULAMENTO.
	 * 
	 * -->L'incapsulamento consente di gestire un oggetto come una 
	 * "scatola nera".
	 * -->dall'esterno si sa COSA fa un oggetto, ma non COME lo fa.
	 * -->è la possibilità di  controllare l'accesso allo stato degli
	 * oggetti tramite appositi metodi.
	 * 
	 * L'incapsulamento consente di nascondere la rappresentazione 
	 * dello stato interno degli oggetti agli utilizzatori.
	 * L'utilizzatore di visualizzaSaldo() non è necessariamente a 
	 * conoscenza che "saldo" è rappresentato nella classe da una
	 * variabile di tipo int.
	 * 
	 * L'utilizzo della terminologia get e set per i metodi che 
	 * consentono di accedere a variabili private è una prassi comune:
	 * getSaldo(), setSaldo();
	 * 
	 */

}
