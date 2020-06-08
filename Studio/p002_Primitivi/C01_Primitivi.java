package p002_Primitivi;

//Il controllo dei tipi effettuato dal compilatore serve a prevenire errori di programmazione.
//Se dichiariamo una variabile di un certo tipo e poi le assegnamo valori di un altro tipo, 
//forse le stiamo assegnando il valore sbagliato.
//Sapere che una variabile è di un certo tipo offre al programmatore delle garanzie:
// int x, y, z;
//Sy.print("risultato" + x/2+(y/4-7)*z*z);
//-->Qualunque siano i valori assegnati a x, y e z il risultato sarà un int.

//I tipi primitivi del linguaggio Java sono i seguenti:S

public class C01_Primitivi {
	public static void main(String[] args) {
		boolean flag = false;
		System.out.println("boolean [1 bit]: " + flag);
		System.out.println();

		char c = 'A';
		System.out.println("char [2 byte]: " + c);
		System.out.println();
		
		byte y = 42;
		System.out.println("byte: [1 byte]" + y);
		System.out.println();
		
		short x = 12_000;
		System.out.println("short: [2 byte]" + x);
		System.out.println();
		
		int i = 1_000_000_000;
		System.out.println("int [4 byte]: " + i);
		System.out.println();
		
		long z = 1_000_000_000_000_000L;
		System.out.println("long [8 byte]: " + z);
		System.out.println();
		
		float f = 3.12e20F;
		System.out.println("float [4 byte]: " + f);
		System.out.println();
		
		double d = 3.12e200;
		System.out.println("double [8 byte]: " + d);
	}

}
