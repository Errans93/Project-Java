package p009_CostruttoriMetodi;

/*
 * Infine, this (o meglio this()) può essere usato dal costruttore
 * per chiamarne un altro.
 * 
 * ATTENZIONE: questo uso è consentito soltato come
 * prima istruzione del costruttore
 */

public class C07_Punto {

	double x, y, k;

	// prende un solo valore e lo assegna sia a x che a y
	public C07_Punto(double z) {
		this(z, z); // chiama l'altro costruttore
	}

	public C07_Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}


	public C07_Punto(double x, double y, double k) {
		this.x = x;
		this.y = y;
		this.k = k;
	}

}
