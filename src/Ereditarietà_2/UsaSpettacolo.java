package Ereditarietà_2;

import java.util.Scanner;

public class UsaSpettacolo {

	public static void main(String[] args) {

		// creo un paio di persone

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

		boolean[] prenotaF = new boolean[4];
		boolean[] prenotaG = new boolean[10];

		for (int i = 0; i < figlio1.length; i++) {
			prenotaF[i] = spet.prenota(figlio1[i]);
			System.out.println(figlio1[i].getNome() + " è studente?");
			risposta = input.next();
			figlio1[i].checkRisposta(risposta);
		}

		for (int i = 0; i < gen1.length; i++) {
			prenotaG[i] = spet.prenota(gen1[i]);
		}

		

		System.out.println();
		System.out.println("***************************************************************");
		System.out.println();

		// stampa l'elenco delle prenotazioni
		spet.stampaPrenotazioni();

		// stampa i posti disponibili
		System.out.println("Posti disponibili: " + spet.postiDisponibili());
		
		for (int i = 0; i < prenotaF.length; i++) {
			if (!prenotaF[i]) {

				spet.esaurito(figlio1[i], prenotaF[i]);
			}

		}

		for (int i = 0; i < prenotaG.length; i++) {
			if (!prenotaG[i]) {

				spet.esaurito(gen1[i], prenotaG[i]);
			}

		}

	}
}
