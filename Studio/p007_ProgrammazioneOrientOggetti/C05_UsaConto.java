package p007_ProgrammazioneOrientOggetti;

public class C05_UsaConto {
	public static void main(String[] args) {

		C05_ContoCorrente cc = new C05_ContoCorrente(1000);

		cc.versa(200);

		if (!cc.preleva(3000))
			System.out.println("Fallito prelevo");

		do {
			cc.preleva(10);
		} while (cc.visualizzaSaldo() >= 41);
		
		System.out.println("Saldo finale: " + cc.visualizzaSaldo() + "è");
				
	}

}
