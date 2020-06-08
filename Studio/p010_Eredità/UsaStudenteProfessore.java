package p010_Eredità;

/*
 * Tuttook...ma quanto codice ripetuto...
 * Studente e Professore hanno diverse cose in comune:
 * -->due variabili di istanza (nome e indirizzo)
 * -->alcuni metodi (getNome(), getIndirizzo(), setIndirizzo())
 * 
 *  Questi membri in effetti non descrivono caratteristiche specifiche degli
 *  Studenti e dei Professori --> sono caratteristiche comuni di tutte le Persone
 */

public class UsaStudenteProfessore {
	public static void main(String[] args) {

		Studente stud1 = new Studente("Edoardo Errani", "Via Letizia 10");
		stud1.setAnno(6);
		stud1.visualizza();
		

		Studente stud2 = new Studente("Enrico Errani", "Via Letizia 13");
		stud2.setIndirizzo("Via Delle Rose 13");
		stud2.visualizza();

		Professore prof1 = new Professore("Alessandro Errani", "Via  Letizia 20", "1012", "Dip. di Legge");
		prof1.visualizza();

		Professore prof2 = new Professore("Alberto Errani", "Via  Letizia 21", "1014", "Dip. di Economia");
		prof2.visualizza();
	}
}
