package p006_ClassiOggetti;

/*
 * Quando si elaborano stringhe spesso si deve lavorare con i singoli
 * caratteri. Tra i tipi primitivi, il tipo char descrive valori che 
 * sono singoli caratteri.
 */

public class C04_AboutChar {
	public static void main(String[] args) {
		
		char carattere = 'a';
		
		/*
		 * I valori di tipo char sono in realt�  codificati come interi
		 * quindi si possono applicare operatori aritmetici.
		 */
		System.out.println(carattere); //Stampa 'a'
		carattere++;
		System.out.println(carattere); //Stampa 'b'
		
		//Il tipo char pu� essere usato anche nell'ambito di uno switch
		
		switch (carattere) {
		case 'a': System.out.println("carattere � a."); break;
		case 'b': System.out.println("carattere � b."); break;
		case 'c': System.out.println("carattere � c."); break;
		case 'd': System.out.println("carattere � d."); break;
		case 'e': System.out.println("carattere � e."); break;
		default : System.out.println("carattere � una lettera dell'alfabeto != da a, b, c, d, e."); break;
		}
	}

}
