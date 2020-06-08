package p008_OOP;

/*
 * VARIABILI STATICHE:
 * -->le variabili statiche possono essere riferite usando il nome
 *  della classe invece che il nome dell'oggetto (si può comunque
 *  usare il nome di un oggetto).
 *  
 *  METODI STATICI:
 *  -->anche un metodo può essere dichiarato static. Un metodo statico
 *  può accedere solo a variabili statiche -> non può utilizzare variabili
 *  d'istanza (ossia, non statiche). Di solito i metodi statici vengono 
 *  creati per funzionalità poichè non hanno bisogno di uno stato.
 *  - non hanno bisogno di creare oggetti;
 *  - possono essere invocati usando il nome della classe;
 *  - tipicamente sono metodi che ricevono i parametri ed eseguono
 *  qualche calcolo generico su di essi. (Math.pow(a,b), Math.random(a)).
 */

public class C01_Scope {

	// variabili statiche appartengono alla classe e sono uguali per ogni oggetto
	private static int staticMember = 5;
	private static long member = 5;

	// istanza sarà diverso per ogni oggetto
	private int istanza;

	public C01_Scope(int setIstanza) {
		istanza = setIstanza;
	}

	public static void f() {
		int local = 7;
		if (staticMember == 2) {
			short inner = 12;
			staticMember = 1 + inner;
			member = 3 + local;
		}
	}

	public static void g() {
		System.out.println(member);
	}

	public void h() {
		istanza += 10;
	}

	public static void main(String[] args) {

		C01_Scope sc = new C01_Scope(5);
		C01_Scope ss = new C01_Scope(7);
		double local = 5;

		System.out.println(local);

		staticMember = 12;
		System.out.println(staticMember);

		staticMember = 2;
		C01_Scope.f();
		System.out.println(staticMember);

		C01_Scope.g();

		System.out.println(sc.istanza);
		System.out.println(ss.istanza);

		sc.h();
		ss.h();

		System.out.println(sc.istanza);
		System.out.println(ss.istanza);

	}

}
