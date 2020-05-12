package p007_ProgrammazioneOrientOggetti;

public class C02_UsaDueConti {
	public static void main(String[] args) {

		C01_ContoCorrente cc1 = new C01_ContoCorrente(1000);
		C01_ContoCorrente cc2 = new C01_ContoCorrente(2000);

		cc1.versa(200);
		cc1.versa(200);

		if (cc1.saldo > 200)
			cc1.preleva(300);

		if (cc2.saldo > 200)
			cc2.preleva(300);

		do {
			cc1.preleva(10);
			cc2.preleva(10);
		} while (cc1.saldo >= 41 && cc2.saldo > cc1.saldo);

		System.out.println("Saldo finale conto 1: " + cc1.saldo + "€");
		System.out.println("Saldo finale conto 2: " + cc2.saldo + "€");
	}// La clsse 01_ContoCorrente rimane quella di prima

}
