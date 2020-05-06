package p006_ClassiOggetti;

/*
 * La concatenazione di due stringhe "Mario" e "Rossi" � semplicemente
 * la stringa "MarioRossi".
 * L'operazione di concatenazione in Java si scrive semplicemente con il "+".
 * L'operatore "+" in Java � sovraccaricato di significati: pu� essere applicato
 * sia a numero che a stringhe. Andiamo a vere cosa succere se si mischiano
 * stringhe e numeri in una sola espressione.  
 */

public class C06_Concatenazione {
	public static void main(String[] args) {
		System.out.println("Rai" + 3); //Concatena
		System.out.println(3 + 4 + 5); //Somma
		System.out.println("Ciao" + 3 + 4 + 5); //Concatena
		System.out.println(3 + 4 + 5 + "Ciao"); //Somma e concatena
		
	}

}
