package p011_Eredit�;

public class UsaStudenteProfessore {
	public static void main(String[] args) {
		
		Persona pers = new Persona("Sono una persona normale ", "Via Letizia 19");
		pers.visualizza();

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
