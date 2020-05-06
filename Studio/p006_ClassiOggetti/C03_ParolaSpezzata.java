package p006_ClassiOggetti;

//Questo programma stampa una parola 3 caratteri per volta

public class C03_ParolaSpezzata {
	public static void main(String[] args) {
		
		String parola = "supercalifragilistichespiralidoso";
		
		for (int i = 0; i < parola.length(); i += 3) {
			
			if (i + 3 >= parola.length()) {
				System.out.println(parola.substring(i, parola.length()));
			} else {
				System.out.println(parola.substring(i, i + 3));
			}
			
		}
		
	}

}
