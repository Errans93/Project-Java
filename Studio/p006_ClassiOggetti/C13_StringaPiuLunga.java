package p006_ClassiOggetti;

/*
 * Inizializzeremo un array di stringhe con i seguenti valori:
 * "gatto", "cane", "topo", "criceto", "pesce".
 * 
 * Andremo a vedere
 */

public class C13_StringaPiuLunga {
	public static void main(String[] args) {

		String[] pets = { "gatto", "cane", "topo", "criceto", "pesce" };
		String piuLunga = "";

		for (String p : pets) {
			if (p.length() > piuLunga.length()) {
				piuLunga = p;
			}
		}
		System.out.println(piuLunga);
		
		int posPiuLunga = 0;
		
		for  (int i = 1; i < pets.length; i++) {
			if (pets[i].length() > pets[posPiuLunga].length())
				posPiuLunga = i;
		}
		System.out.println(pets[posPiuLunga]);
	}
}
