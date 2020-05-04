package p005_MetodiAusiliari;

//I metodi posso anche prevedere PARAMETRI
//ESEMPIO:

//metodo che calcola la somma di due numeri

//metodo che dimostra l'importanza dell'ordine 
//dei parametri nella chiamata di un metodo

public class C02_SommaConMetodo {
	public static void main(String[] args) {
		int a = 5, b = 10;
		
		int ris = primo(a, b);
		
		System.out.println(somma(a, b));
		
		System.out.println(ris);
	}

	private static int somma(int x, int y) {
		return x + y;

	}

//Nella dichiarazione di somma tra le parentesi tonde sono indicati i 
//parametri attesi (PARAMETRI FORMALI) con i rispettivi tipi. (--> x e y)

//Nella chiamata di somma tra le parentesi tonde sono indicati i valori 
//(PARAMETRI ATTUALI, o ARGOMENTI) che sono passati al metodo per calcolare 
//il risultato. (--> a e b)

//I parametri formali di un metodo sono variabili locali al corpo del metodo.
//Un metodo non vede i parametri e le variabili di un altro.

//I valori dei parametri attuali vengono assegnati (copiati) nella variabili
//usate come parametri formali del metodo.
//-->Un metodo deve sempre essere chiamato con parametri attuali di tipi 
//compatibili con quelli dei parametri formali (e NELL'ORDINE GIUSTO).

//I nomi dei parametri formali e delle variabili di metodi diversi 
//non interferiscono tra loro.

	private static int primo(int b, int a) {
		return b;
	}
}
