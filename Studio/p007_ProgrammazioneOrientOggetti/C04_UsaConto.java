package p007_ProgrammazioneOrientOggetti;

public class C04_UsaConto {
	public static void main(String[] args) {

		C04_ContoCorrente cc = new C04_ContoCorrente(1000);

		cc.versa(200);

		if (!cc.preleva(3000))
			System.out.println("Fallito prelevo");

		do {
			cc.preleva(10);
		} while (cc.saldo >= 41);
		
		System.out.println("Saldo finale: " + cc.saldo + "è");

		/*
		 * Prima abbiamo aggiunto la stampa dei messaggi per tracciare
		 * le operazioni sul conto..
		 * -->ma chi vieta all'utilizzatore di questa classe di modificare
		 * A MANO il saldo?
		 */
		
		cc.saldo = 1000;
		//In effetti il saldo è pubblico (public).
		
		System.out.println("Saldo: " + cc.saldo + "è");

	}

}
