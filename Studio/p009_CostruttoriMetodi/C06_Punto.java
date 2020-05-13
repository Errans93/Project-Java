package p009_CostruttoriMetodi;

/*
 * THIS:
 * In ogni corpo di un metodo di istanza (o di un costruttore)
 * � sempre disponibile la variabile this.
 * -->� un riferimento all'oggetto su cui si invoca il metodo
 * (o costruttore)
 * -->� detto parametro implicito del metodo
 * 
 * Il riferimento this pu� essere usato per accedere alle variabili
 * di istanza del metodo e consente di usare come nome dei parametri
 * formali gli stessi nomi delle variabili di istanza.
 */

public class C06_Punto {

	public double x;
	public double y;

	public C06_Punto(double x, double y) {
		// variabiliDiIstanza.this = parametri;
		this.x = x;
		this.y = y;
	}
	/*
	 * L'uso di this pu� rendere pi� chiara la lettura del codice di classi
	 * complesse: -->� subito chiaro che si sta usando una variabile di istanza
	 * 
	 * THIS consente anche di scrivere metodi che restituiscono un riferimento
	 * all'oggetto corrente:
	 * 
	 * -->restituisce il "minimo" tra p e l'oggetto corrente
	 */

	public C06_Punto minimo(C06_Punto p) {
		if ((p.x + p.y) > (this.x + this.y)) {
			return this;
		} else
			return p;

	}

}
