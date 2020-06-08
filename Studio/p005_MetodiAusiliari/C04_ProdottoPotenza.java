package p005_MetodiAusiliari;

import java.util.Scanner;

public class C04_ProdottoPotenza {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserire i numeri interi che si vogliono utilizzare: ");
		System.out.print("Prima x: ");
		long x = input.nextInt();
		System.out.print("Poi y: ");
		long y = input.nextInt();

		System.out.println("Inserire (1) per il prodotto (x*y) o (2) per la potenza (x^y): ");
		int scelta = input.nextInt();
		long ris = 1;

		if (scelta == 1) {

			ris = prodotto(x, y);
			
			System.out.print("Il prodotto x*y è: ");
			System.out.println(ris);

		} else if (scelta == 2) {
			for (int i = 0; i < y; i++) {

				ris = prodotto(x, ris);
			}
			System.out.print("La potenza (x^y) è: ");
			System.out.println(ris);
		} else
			System.out.println("ERRORE");
	}

	private static long prodotto(long x, long y) {

		return x * y;
	}

}
