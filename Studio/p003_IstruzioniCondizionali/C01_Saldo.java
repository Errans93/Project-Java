package p003_IstruzioniCondizionali;

import java.util.Scanner;

//In un programma spesso c'è bisogno di scegliere tra operazioni diverse 
//--> per questo esiste l'espressione condizionale if - else

//Un'ostruzione if - else ha la seguente forma:
//		if(condizione) comando else comando
//dove:
//la condizione è dette guardia dell'if
//--> la guardia può essere vera o falsa
//I due comandi alternativi sono detti anche rami
//--> il ramo else è opzionale

//Se in un ramo c'è più di un istruzione ci vuole un BLOCCO
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
			System.out.println("Il saldo è positivo o zero.");
		else
			System.out.println("Il saldo è negativo.");

		System.out.println();
		System.out.println("Grazie per avere usato il nostro servizio.");
		
		System.out.println();
		System.out.println("ESEMPIO 2:");
		System.out.println("Inserisci il saldo del tuo conto corrente:");
		double saldo1 = input.nextDouble();
		
		double tassoAttivo = 2.5;
		double tassoPassivo = 2;
		
		if (saldo1 >= 0) {
			System.out.println("Il saldo è positivo o zero.");
			double interesseAttivo = saldo1*tassoAttivo;
			saldo1 = saldo1 + interesseAttivo;
		} else {
			System.out.println("Il saldo è negativo.");
			double interessePassivo = saldo1*tassoPassivo;
			saldo1 = saldo1 + interessePassivo;
		}
		
		System.out.println("Nuovo Saldo:");
		System.out.println(saldo1);
		System.out.println("Grazie per avere usato il nostro servizio.");
	}

}
