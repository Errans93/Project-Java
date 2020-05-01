package Primitivi;

public class Primitivi {

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
