package p009_CostruttoriMetodi;

public class C01_UsaAccessi {
	public static void main(String[] args) {
		C01_Accessi ac = new C01_Accessi();
		C01_Accessi acc = new C01_Accessi();

		// c --> variabile statica (della classe)
		System.out.println(C01_Accessi.c);

		// b --> variabile di istanza (caratteristica dell'oggetto)
		System.out.println(ac.b);

		acc.g();
		System.out.println(acc.b);

		// Con a non posso fare cosi per accedere al suo valore
		// poiché privata. devo accedere tramite un metodo publlico
		// System.out.println(ac.a); --> Non mi da nulla (come se a non esistesse)

		// stampo a di ac
		System.out.println(ac.f());

		// stampo a di acc
		System.out.println(acc.f());

		// molto rischioso accedere a variabili statiche con oggetti
		System.out.println(ac.c);
		System.out.println(acc.c);
		// se si modifica c tramite ac, allora la stessa modifica andrà
		// a influenzare acc (poichè c appartiene alla classe non all'oggetto)
		ac.c = 19;
		System.out.println(ac.c);
		System.out.println(acc.c);

	}

}
