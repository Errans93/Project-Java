package Ereditarietà_2;

import java.util.Scanner;

public class UsaSpettacolo {

	public static void main(String[] args) {

		// creo un paio di persone

		Figlio figlio1 = new Figlio("Edoardo Errani", "Via Letizia 1", true);
		Figlio figlio2 = new Figlio("Nicola Errani", "Via Letizia 2", true);
		Figlio figlio3 = new Figlio("Francesco Errani", "Via Letizia 3", true);
		Figlio figlio4 = new Figlio("Enrico Errani", "Via Letizia 4", true);

		Genitore gen1 = new Genitore("Giulio Errani", "Via Letizia 5", "Avvocato");
		Genitore gen2 = new Genitore("Alberto Errani", "Via Letizia 6", "Chimico");
		Genitore gen3 = new Genitore("Maddalena Errani", "Via Letizia 7", "Fisico");
		Genitore gen4 = new Genitore("Margherita Errani", "Via Letizia 8", "Notaio");
		Genitore gen5 = new Genitore("Lorenzo Errani", "Via Letizia 9", "Medico");

		Genitore gen6 = new Genitore("Giulio Errani", "Via Letizia 10", "Avvocato");
		Genitore gen7 = new Genitore("Andrea Errani", "Via Letizia 11", "Chimico");
		Genitore gen8 = new Genitore("Maddalena Errani", "Via Letizia 12", "Fisico");
		Genitore gen9 = new Genitore("Margherita Errani", "Via Letizia 13", "Notaio");
		Genitore gen10 = new Genitore("Lorenzo Errani", "Via Letizia 14", "Medico");

		Spettacolo spet = new Spettacolo("Macbeth", "Attori dilettanti", "25/03/2020 - 21.00");

		Scanner input = new Scanner(System.in);
		String risposta;

		// prenota posti
		
		boolean[] prenotaz = new boolean[10];
		
		prenotaz[0] = spet.prenota(figlio1);
		System.out.println(figlio1.getNome() + " è studente?");
		risposta = input.next();
		figlio1.checkRisposta(risposta);
		System.out.println(prenotaz[0]);

		prenotaz[1] = spet.prenota(figlio2);
		System.out.println(figlio2.getNome() + " è studente?");
		risposta = input.next();
		figlio2.checkRisposta(risposta);
		System.out.println(prenotaz[1]);

		prenotaz[2] = spet.prenota(figlio3);
		System.out.println(figlio3.getNome() + " è studente?");
		risposta = input.next();
		figlio3.checkRisposta(risposta);
		System.out.println(prenotaz[2]);

		prenotaz[3] = spet.prenota(figlio4);
		System.out.println(figlio4.getNome() + " è studente?");
		risposta = input.next();
		figlio4.checkRisposta(risposta);
		System.out.println(prenotaz[3]);
		
		prenotaz[4] = spet.prenota(gen1);
		System.out.println(prenotaz[4]);
		prenotaz[5] = spet.prenota(gen2);
		System.out.println(prenotaz[5]);
		prenotaz[6] = spet.prenota(gen3);
		System.out.println(prenotaz[6]);
		prenotaz[7] = spet.prenota(gen4);
		System.out.println(prenotaz[7]);
		prenotaz[8] = spet.prenota(gen5);
		System.out.println(prenotaz[8]);
		prenotaz[9] = spet.prenota(gen6);
		System.out.println(prenotaz[9]);
		prenotaz[10] = spet.prenota(gen7);
		System.out.println(prenotaz[10]);
		// boolean ok12 = spet.prenota(gen8);
		// boolean ok13 = spet.prenota(gen9);
		// boolean ok14 = spet.prenota(gen10);
		
		for (int i = 0; i < prenotaz.length + 1; i++) {
			if (!prenotaz[i]) {
				System.out.println("Biglietti finiti");
			}
		}
		
		System.out.println();
		System.out.println("***************************************************************");
		System.out.println();
		
		
		
		
		
		// if (!ok1 || !ok2 || !ok3 || !ok4 || !ok5 || !ok6 || !ok7 || !ok8 || !ok9 ||
		// !ok10 || !ok11 || !ok12 || !ok13
		// || !ok14)
		//if (!ok1 || !ok2 || !ok3 || !ok4 || !ok5 || !ok6 || !ok7 || !ok8 || !ok9 || !ok10 || !ok11)
			//System.out.println("Biglietti finiti");

		// stampa l'elenco delle prenotazioni
		spet.stampaPrenotazioni();

		// stampa i posti disponibili
		System.out.println("Posti disponibili: " + spet.postiDisponibili());

	}
}
