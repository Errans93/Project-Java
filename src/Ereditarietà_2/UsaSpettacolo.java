package Ereditarietà_2;

import java.util.Scanner;

public class UsaSpettacolo {

	public static void main(String[] args) {

		// creo un paio di persone

		// Figlio figlio1 = new Figlio("Edoardo Errani", "Via Letizia 1", true);
		// Figlio figlio2 = new Figlio("Nicola Errani", "Via Letizia 2", true);
		// Figlio figlio3 = new Figlio("Francesco Errani", "Via Letizia 3", true);
		// Figlio figlio4 = new Figlio("Enrico Errani", "Via Letizia 4", true);

		// Genitore gen1 = new Genitore("Giulio Errani", "Via Letizia 5", "Avvocato");
		// Genitore gen2 = new Genitore("Alberto Errani", "Via Letizia 6", "Chimico");
		// Genitore gen3 = new Genitore("Maddalena Errani", "Via Letizia 7", "Fisico");
		// Genitore gen4 = new Genitore("Margherita Errani", "Via Letizia 8", "Notaio");
		// Genitore gen5 = new Genitore("Lorenzo Errani", "Via Letizia 9", "Medico");
		// Genitore gen6 = new Genitore("Giulio Errani", "Via Letizia 10", "Avvocato");
		// Genitore gen7 = new Genitore("Andrea Errani", "Via Letizia 11", "Chimico");
		// Genitore gen8 = new Genitore("Maddalena Errani", "Via Letizia 12", "Fisico");
		// Genitore gen9 = new Genitore("Margherita Errani", "Via Letizia 13",
		// "Notaio");
		// Genitore gen10 = new Genitore("Lorenzo Errani", "Via Letizia 14", "Medico");

		Figlio[] figlio1 = new Figlio[4];
		figlio1[0] = new Figlio("Edoardo Errani", "Via Letizia 1", true);
		figlio1[1] = new Figlio("Nicola Errani", "Via Letizia 2", true);
		figlio1[2] = new Figlio("Francesco Errani", "Via Letizia 3", true);
		figlio1[3] = new Figlio("Enrico Errani", "Via Letizia 4", true);

		Genitore[] gen1 = new Genitore[10];
		gen1[0] = new Genitore("Giulio Errani", "Via Letizia 5", "Avvocato");
		gen1[1] = new Genitore("Alberto Errani", "Via Letizia 6", "Chimico");
		gen1[2] = new Genitore("Maddalena Errani", "Via Letizia 7", "Fisico");
		gen1[3] = new Genitore("Margherita Errani", "Via Letizia 8", "Notaio");
		gen1[4] = new Genitore("Lorenzo Errani", "Via Letizia 9", "Medico");
		gen1[5] = new Genitore("Giulio Errani", "Via Letizia 10", "Avvocato");
		gen1[6] = new Genitore("Andrea Errani", "Via Letizia 11", "Chimico");
		gen1[7] = new Genitore("Maddalena Errani", "Via Letizia 12", "Fisico");
		gen1[8] = new Genitore("Margherita Errani", "Via Letizia 13", "Notaio");
		gen1[9] = new Genitore("Lorenzo Errani", "Via Letizia 14", "Medico");

		Spettacolo spet = new Spettacolo("Macbeth", "Attori dilettanti", "25/03/2020 - 21.00");

		Scanner input = new Scanner(System.in);
		String risposta;

		// prenota posti

		boolean[] prenotaz = new boolean[14];

		prenotaz[0] = spet.prenota(figlio1[0]);
		System.out.println(figlio1[0].getNome() + " è studente?");
		risposta = input.next();
		figlio1[0].checkRisposta(risposta);

		prenotaz[1] = spet.prenota(figlio1[1]);
		System.out.println(figlio1[1].getNome() + " è studente?");
		risposta = input.next();
		figlio1[1].checkRisposta(risposta);

		prenotaz[2] = spet.prenota(figlio1[2]);
		System.out.println(figlio1[2].getNome() + " è studente?");
		risposta = input.next();
		figlio1[2].checkRisposta(risposta);

		prenotaz[3] = spet.prenota(figlio1[3]);
		System.out.println(figlio1[3].getNome() + " è studente?");
		risposta = input.next();
		figlio1[3].checkRisposta(risposta);

		prenotaz[4] = spet.prenota(gen1[0]);
		prenotaz[5] = spet.prenota(gen1[1]);
		prenotaz[6] = spet.prenota(gen1[2]);
		prenotaz[7] = spet.prenota(gen1[3]);
		prenotaz[8] = spet.prenota(gen1[4]);
		prenotaz[9] = spet.prenota(gen1[5]);
		prenotaz[10] = spet.prenota(gen1[6]);
		prenotaz[11] = spet.prenota(gen1[7]);
		prenotaz[12] = spet.prenota(gen1[8]);
		prenotaz[13] = spet.prenota(gen1[9]);

		for (int i = 0; i < prenotaz.length; i++) {
			figlio1[i].esaurito(prenotaz[i]);
		}
		
		
		for (int i = 0; i < prenotaz.length; i++) {
			if (i < 4) {
				if (!prenotaz[i]) {
					System.out.println("Il Biglietto di " + figlio1[i].getNome()
							+ " non può essere venduto -> i biglietti sono FINITI");

				}
			} else {
				if (!prenotaz[i]) {
					System.out.println("Il Biglietto di " + gen1[i - 4].getNome()
							+ " non può essere venduto -> i biglietti sono FINITI");
				}
			}

		}

		System.out.println();
		System.out.println("***************************************************************");
		System.out.println();

		// if (!ok1 || !ok2 || !ok3 || !ok4 || !ok5 || !ok6 || !ok7 || !ok8 || !ok9 ||
		// !ok10 || !ok11 || !ok12 || !ok13
		// || !ok14)
		// if (!ok1 || !ok2 || !ok3 || !ok4 || !ok5 || !ok6 || !ok7 || !ok8 || !ok9 ||
		// !ok10 || !ok11)
		// System.out.println("Biglietti finiti");

		// stampa l'elenco delle prenotazioni
		spet.stampaPrenotazioni();

		// stampa i posti disponibili
		System.out.println("Posti disponibili: " + spet.postiDisponibili());

	}
}
