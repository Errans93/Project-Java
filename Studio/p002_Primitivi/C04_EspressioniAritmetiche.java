package p002_Primitivi;

//Le espressioni aritmetiche più semplici sono costituite da singoli letterali
//--> Letterali interi: 1, 2, 3, -1, -2, -3, ...
//--> Letterali frazionari: 1.0, 2.0, 3.0, -1.2, -2.0, -3.3...

//Espressioni più complesse si ottengono utilizzando operatori aritmetici:
//--> *
//--> % (MODULO - resto di divisione tra interi)
//--> -
//--> +
//--> /

//L'operatore "/" si comporta diversamente a seconda che sia applicato a 
//letterali interi o frazionari:

//25/2 = 12 (Divisione intera)	25.0/2.0 = 12.5 (Divisione reale)

//Un'operazione tra un letterale intero e uno frazionario viene eseguita
//come tra due frazionari.

//-->		int/fraz = fraz



public class C04_EspressioniAritmetiche {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		double c = 3.0;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println();
		System.out.println(a + c);
		System.out.println(a - c);
		System.out.println(a * c);
		System.out.println(a / c);
		System.out.println(a % c);
		
		
		
		
	}
}
