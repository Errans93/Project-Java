package p009_CostruttoriMetodi;

/*
 * La variabile privata area della classe C03_Finestra 
 * è al sicuro?
 * 
 * -->No!!
 * 
 * Vediamo cosa potrebbe fare un utilizzatore della
 *  classe finestra
 */

public class C03_UsaArea {
	public static void main(String[] args) {
		
		C03_Finestra fin = new C03_Finestra();
		C03_Rettangolo ret = fin.getArea();
		
		System.out.println(ret.base);
		
		ret.base = 100; //La variabile base rimane sempre pubblica
		
		C03_Rettangolo rett = fin.getArea();
		
		System.out.println(rett.base);

		
	}
}
