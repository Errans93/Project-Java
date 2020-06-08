package p007_ProgrammazioneOrientOggetti;

/*
 * Abbiamo modificato la classe C01_ContoCorrente.. dobbiamo mettere mano
 * anche al main (e/o alle altri classi che lo usano)?
 * 
 *  ---->NO!!<----
 *  HIGHLIGHT --> se non modifichiamo l'interfaccia pubblica (nomi dei metodi,
 *  parametri, valori di ritorno) possiamo modificare la classe senza compromettere
 *  il resto del programma.
 *  -->più facile fare manutenzione e agiornamenti a parti del programma.
 */

public class C03_UsaConto {
	public static void main(String[] args) {

		// Creo un nuovo conto corrente (cc) iniziallizzato con 1000 euro
		C03_ContoCorrente cc = new C03_ContoCorrente(1000);

		// verso 200 euro nel mio conto
		cc.versa(200);

		// Faccio un paio di prelevi controllondo se ho soldi nel mio conto
		if (cc.saldo > 200)
			cc.preleva(300);

		do {
			cc.preleva(10);
		} while (cc.saldo >= 41);

		System.out.println("Saldo finale: " + cc.saldo + "è");

	}
}
