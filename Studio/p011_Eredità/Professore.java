package p011_Eredit�;

/*
 * Ci� che si pu� fare ora � di ridefinire le classi Studente
 * e Professore come fossero estensioni della classe Persona.
 * Le clssi Studente e Professore erediteranno cos� i membri
 * di Persona (senza doverli definire di nuovo) --> Tali membri
 * saranno definiti una volta sola (in Persona).
 * 
 * Per definire una classe come estensione di un altra si deve
 * usare la primitiva extends --> deve essere usata all'inizio
 * della definizione della classe.
 * 
 * public class Studente extends Persona {
 * ---
 * }
 * 
 * Terminologia:
 * 
 * -->la classe che viene estesa (Persona) � detta SUPERCLASSE
 * -->la classe che estende (Professore) � detta SOTTOCLASSE
 * 
 * Ridefiniamo Professore
 */

public class Professore extends Persona {

	private String codiceDocente;
	private String dipartimento;

	public Professore(String nome, String indirizzo, String codiceDocente, String dipartimento) {
		super(nome, indirizzo);
		this.codiceDocente = codiceDocente;
		this.dipartimento = dipartimento;

	}

	public String getCodiceDocente() {
		return codiceDocente;

	}

	public String getDipartimento() {
		return dipartimento;
	}

	@Override
	public void visualizza() {
		System.out.println("        Nome: " + getNome());
		System.out.println("   Indirizzo: " + getIndirizzo());
		System.out.println("      Codice: " + codiceDocente);
		System.out.println("Dipartimento: " + dipartimento);

		System.out.println();
		
		/*
		 * Il metodo visualizza di Studente e Professore richiede
		 * due osservazioni:
		 * 
		 * 1) Nome e indirizzo sono variabili private di Persona
		 * -->il fatto che Studente e Professore siano sottoclasse
		 * non le autorizzano ad accedere a variabili private
		 * 
		 * Conseguenze:
		 * -->devo usare i metodi pubblici (se disponibili, come in 
		 * questo caso)
		 * -->devo modificare il modificatore di visibilit� private
		 * di nome e indirizzo in Persona
		 * 
		 * 2) visualizza() era gi� stato definito in Persona
		 * -->questo � il caso di OVERRIDING di un metodo
		 * -->la sottoclasse ridefinisce (sostituendolo) un metodo
		 * della superclasse
		 * 
		 * Per ottenere l'overriding di un metodo � necessario che la 
		 * firma del metodo della sotto classe sia identica a quella del
		 * metodo della superclasse --> in caso contrario avremo un OVERLOADING
		 * -->entrambi i metodi (il vecchio e il nuovo) sarebbero
		 * abilitati ed invocati in base alla firma.
		 * 
		 * Quando vado a fare un Overriding di un metodo posso andare
		 * a scrivere sopra il metodo della sotto classe @Override in 
		 * modo che il compilatore sia sicuro che quel metodo sia lo stesso
		 * MA modificato.
		 * 
		 * ATTENZIONE:
		 * Override e Overload di metodi sono due cose molto diverse:
		 * - Overloading - � un meccanismo che consente di avere pi�
		 * metodi con lo stesso nome (ma con firma differente)
		 * 
		 * - Overriding - � un meccanismo che consente di sostituire
		 * un metodo della superclasse
		 */
	}

}
