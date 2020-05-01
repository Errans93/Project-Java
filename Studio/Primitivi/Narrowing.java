package Primitivi;

//Si può forzare una conversione (type cast) nel modo seguente.
//La trsformazione (da double a int per es.) è ottenuta troncando
//il numero --> si eliminano le cifre decimali: 25.99 -> 25.

public class Narrowing {

	public static void main(String[] args) {
		double d = 41;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;

		System.out.println(b);

		char c = (char) i;
		short s2 = (short) c;
		System.out.println(c + " " + s2);
	}

}
