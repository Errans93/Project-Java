package p006_ClassiOggetti;

//Qui vedremo come convertire stringhe in numeri e viceversa

public class C07_Conversione {
	public static void main(String[] args) {
		
		//Ci sono diversi modi per convertire un numero in una stringa
		
		int numInt = 2020;
		String string1 = Integer.toString(numInt);
		String string2 = "" + numInt;
		
		System.out.println("Le mie due stringhe sono: " + string1 + ", " + string2);
		
		double numDou = 2020.0;
		String string3 = Double.toString(numDou);
		String string4 = "" + numDou;
		
		System.out.println("Le mie due stringhe sono: " + string3 + ", " + string4);
		
		//Ora converto una stringa in un numero
		
		String pi = "3.1415";		
		double piG = Double.parseDouble(pi);
		System.out.println("Il mio double è: " + piG);
		
		String mil = "10000000";
		int mill = Integer.parseInt(mil);
		System.out.println("Il mio int è: " + mill);
		
	}

}
