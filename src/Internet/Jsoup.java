package Internet;

import java.io.*;
import java.util.Scanner;
import java.net.URL;

public class Jsoup {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci qui il tuo numero");

		int numero = input.nextInt();
		
		int primo = 0;
		int secondo = 1;
		int terzo = 0;
		System.out.print(terzo + " " + secondo + " ");
		
		for ( int i = 2 ; i <= numero ; i ++) {
			terzo = primo + secondo;
			primo = secondo;
			secondo = terzo;
			
			System.out.print(terzo + " ");
		}
	}
}
