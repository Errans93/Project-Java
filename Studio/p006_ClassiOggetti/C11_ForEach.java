package p006_ClassiOggetti;

//Nell'ambito degli array (ma non solo..) esiste una versione "semplificata"
//del comando for. Questa versione del for viene chiamata for-esch

public class C11_ForEach {
	public static void main(String[] args) {
		String[] stringhe = new String[10];
		stringhe[0] = "Edoardo";
		stringhe[1] = "Errani";
		stringhe[2] = "Enrico";
		stringhe[3] = "Errani";
		stringhe[4] = "Alessandro";
		stringhe[5] = "Errani";
		stringhe[6] = "Alberto";
		stringhe[7] = "Errani";
		stringhe[8] = "Giulio";
		stringhe[9] = "Errani";
		
		System.out.println("FOR_EACH: ");
		for (String s: stringhe)
			System.out.println(s);
		
		
		/*
		 * Nell'esempio: per ogni (for-each) stringa s nell'array stringhe
		 * stampa s. Gli elementi vengono presi in ordine di posizione
		 * nell'array. La variabile locale usata nel for-esch:
		 * -->deve essere compatibile con il tipo di array
		 * -->consente di usare gli elementi dell'array in una sola lettura
		 * (contiene una copia dell'elemento corrente: se si fanno modifiche 
		 * alla variabile non si hanno effetti sugli elementi dell'array).
		 * 
		 * Lo stesso esempio si può "tradurre" con un ciclo for tradizionale:
		 */
		System.out.println();
		System.out.println("FOR: ");
		for (int i = 0; i < stringhe.length; i ++)
			System.out.println(stringhe[i]);
	}
}
