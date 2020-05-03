package p003_IstruzioniCondizionali;

import java.util.Scanner;

//Un programma che cotrolla la temperatura corporea e il battito cardiaco

public class C07_Febbre {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci la temperatura corporea:");
		double febbre = input.nextDouble();

		System.out.println("Inserisci i tuoi battiti cardiaci al minuto");
		int battito = input.nextInt();

		boolean febbreNo, febbreBassa, febbreAlta;
		boolean battitoAccelerato, battitoOk;

		febbreNo = febbre <= 36.9;
		febbreBassa = febbre >= 37.0 && febbre <= 37.9;
		febbreAlta = febbre >= 38.0;

		battitoOk = battito < 80;
		battitoAccelerato = battito >= 80;

		if (febbreNo && battitoOk)
			System.out.println("In salute");
		else if ((febbreBassa && battitoAccelerato) || febbreAlta)
			System.out.println("Stato febbrile");
		else
			System.out.println("Stato poco febbrile");

	}
}
