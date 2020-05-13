package p009_CostruttoriMetodi;

/*
 *In Java il passaggio dei parametri  ai metodi avviene per
 *valore --> I metodi lavorano su copie delle variabili passate
 *come parametri.
 *E quando si passano oggetti a metodi?
 *Le variabili di tipo Clesse contengono rifrimenti a oggetti:
 *-->ciò che viene copiato al momento della chiamata è il riferimento;
 *-->il metodo lavora sull'oggetto originale (acceduto tramite la copia 
 *del riferimento). 
 */

public class C03_Rettangolo {

	public int base;
	public int altezza;

	public C03_Rettangolo(int a, int b) {
		base = a;
		altezza = b;
	}

}
