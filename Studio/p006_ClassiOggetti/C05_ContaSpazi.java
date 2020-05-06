package p006_ClassiOggetti;

import java.util.Scanner;

//Questo programma conta i caratteri  di spazio in un testo

public class C05_ContaSpazi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una riga di testo:");
		String rigaTesto = input.nextLine();
		
		int count = 0;
		int i = rigaTesto.indexOf(' ');
		
		while (i != -1) {
			if (i != -1)
				count++;
			i = rigaTesto.indexOf(' ', i +1);
		}
		System.out.print("Gli spazi sono: ");
		System.out.println(count);
	}

}
