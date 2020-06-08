package p005_MetodiAusiliari;

//L'espressione che segue ogni return di un metodo deve avere 
//un tipo compatibile con il tipo del metodo:

//	private static int prova()
//		return 3.5;
//		-->questo mi darà errore. Il metodo si aspetta un intero 
//		non un numero a virgola mobile.

public class C05_Return {

	public static void main(String[] args) {
		int x = 5, y = -4;
		System.out.print("prova1(x): ");
		System.out.println(prova1(x));
		System.out.print("prova1(y): ");
		System.out.println(prova1(y));
		
		System.out.print("prova2(): ");
		prova2();
	}

	// Il comando return può essere utilizzato più volte in un metodo.
	private static int prova1(int x) {
		if (x < 0)
			return 0;
		else
			return x * x;
	}

	// Il compilatore controlla che il comando return sia sempre raggiungibile:

	/*
	 * private static int proova1(int x) { if (x > 3) return 0; --> e se x non fosse
	 * maggiore di 3? }
	 */

	// Quando un metodo NON PREVEDE un risultato si usa il tipo void
	private static void prova2() {
		System.out.print("Sono di tipo void");
	}

}
