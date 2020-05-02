package p003_IstruzioniCondizionali;

import java.util.Scanner;

//In un programma spesso c'� bisogno di scegliere tra operazioni diverse 
//--> per questo esiste l'espressione condizionale if - else

//Un'ostruzione if - else ha la seguente forma:
//		if(condizione) comando else comando
//dove:
//la condizione � dette guardia dell'if
//--> la guardia pu� essere vera o falsa
//I due comandi alternativi sono detti anche rami
//--> il ramo else � opzionale

//Se in un ramo c'� pi� di un istruzione ci vuole un BLOCCO
//-->BLOCCO = Sequenza di comandi racchiusi tra {--comandi--}
//quindi l'espressione if - else prende la forma:
//		if(condizione) {--comandi--} else {--comandi--}

public class C01_Saldo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double saldo;
		// Chiedo il saldo del conto corrente
		System.out.println("Inserisci il saldo del tuo conto corrente:");
		saldo = input.nextDouble();

		if (saldo >= 0)
			System.out.println("Il saldo � positivo o zero.");
		else
			System.out.println("Il saldo � negativo.");

		System.out.println();
		System.out.println("Grazie per avere usato il nostro servizio.");
	}

}
