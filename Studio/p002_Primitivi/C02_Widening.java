package p002_Primitivi;

//le regole di compatibilità degli assegnamenti consentono di
//convertire automaticamente byte -> short -> int -> long -> float -> double
//Ovviamente vale anche byte -> double (la relazione è transitiva)

public class C02_Widening {
	
	public static void main(String[] args) {
		byte b = 41;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;

		System.out.println(d);

		char c = (char) s;
		int i2 = c;
		System.out.println(c + " " + i2);
	}

}
