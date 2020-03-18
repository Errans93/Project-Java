package Learn;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// crea un nuovo conto corrente inizializzato con 1000 euro
		Studente stud1 = new Studente("Edoardo Errani", "Via Letizia 19");
		Studente stud2 = new Studente("Enrico Errani", "Via Letizia 19");
		Professore prof = new Professore("Alessandro Errani", "Via Letizia 19", "Ales_1234", "Giuris");
		Scanner input = new Scanner(System.in);

		// Edoardo
		System.out.println("Studente: " + stud1.getNome() + ";" + " Indirizzo: " + stud1.getIndirizzo() + ";"
				+ " Matricola: " + stud1.getMatricola());

		System.out.println("Inserisci la facoltà");
		System.out.println();
		String facoltà = "Default";
		String fac;
		do {
			String fac1 = input.next();
			String fac2 = input.nextLine();
			fac = fac1 + fac2;
			System.out.println("Hai inserito: " + fac + "." + " Va bene?");
			System.out.println();
			System.out.println("[1] = Si; [2] = No");

			int prem2 = input.nextInt();

			switch (prem2) {
			case 1:
				facoltà = fac;
				break;
			case 2:
				System.out.println("Re-inserisci il nome della facoltà");
				break;
			default:
				System.out.println("La tua scelta non è valida");
				break;
			}
		} while (!facoltà.equals(fac)); // Esegui il do mentre !facoltà.equals(check) è false. Nel caso in cui sia
										// vero esco dal ciclo

		stud1.setFacoltà(facoltà);

		System.out.println("A quale anno appartieni?");

		int anno = input.nextInt();

		stud1.setAnno(anno);
		// stud1.isFuoricorso();

		System.out.println("Vivi in via Letizia?");
		String indirizzo = "Via Letizia";
		System.out.println("[1] = Si; [2] = No");

		int prem1 = input.nextInt();

		switch (prem1) {
		case 1:
			break;
		case 2:
			System.out.println("Inserisci il nome della via dove abiti");
			String ind1 = input.next();
			String ind2 = input.nextLine();
			indirizzo = ind1 + ind2;
			stud1.setIndirizzo(indirizzo);
			break;
		default:
			System.out.println("La tua scelta non è valida");
			indirizzo = "Non è stato inserito alcun indirizzo";
			stud1.setIndirizzo(indirizzo);
			break;
		}

		System.out.println("Quindi:");
		System.out.println();
		stud1.visualizza();
		System.out.println();
		System.out.println("******************************************************************");
		System.out.println();
		
		
		// Enrico
		System.out.println("Studente: " + stud2.getNome() + ";" + " Indirizzo: " + stud2.getIndirizzo() + ";"
				+ " Matricola: " + stud2.getMatricola());

		System.out.println("Inserisci la facoltà");
		System.out.println();
		// String facoltà = "Default";
		// String fac;
		do {
			String fac1 = input.next();
			String fac2 = input.nextLine();
			fac = fac1 + fac2;
			System.out.println("Hai inserito: " + fac + "." + " Va bene?");
			System.out.println();
			System.out.println("[1] = Si; [2] = No");

			int prem2 = input.nextInt();

			switch (prem2) {
			case 1:
				facoltà = fac;
				break;
			case 2:
				System.out.println("Re-inserisci il nome della facoltà");
				break;
			default:
				System.out.println("La tua scelta non è valida");
				break;
			}
		} while (!facoltà.equals(fac)); // Esegui il do mentre !facoltà.equals(check) è false. Nel caso in cui sia
										// vero esco dal ciclo

		stud1.setFacoltà(facoltà);

		System.out.println("A quale anno appartieni?");

		anno = input.nextInt();

		stud2.setAnno(anno);
		// stud1.isFuoricorso();

		System.out.println("Vivi in via Letizia?");
		// String indirizzo = "Via Letizia";
		System.out.println("[1] = Si; [2] = No");

		int prem3 = input.nextInt();

		switch (prem3) {
		case 1:
			break;
		case 2:
			System.out.println("Inserisci il nome della via dove abiti");
			String ind1 = input.next();
			String ind2 = input.nextLine();
			indirizzo = ind1 + ind2;
			stud2.setIndirizzo(indirizzo);
			break;
		default:
			System.out.println("La tua scelta non è valida");
			indirizzo = "Non è stato inserito alcun indirizzo";
			stud2.setIndirizzo(indirizzo);
			break;
		}

		System.out.println("Quindi:");

		stud2.visualizza();

		// Alessandro
		System.out.println("Professore: " + prof.getNome() + ";" + " Indirizzo: " + prof.getIndirizzo());

	}

}
