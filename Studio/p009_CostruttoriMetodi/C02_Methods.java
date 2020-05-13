package p009_CostruttoriMetodi;

/*
 * La dichiarazione di un metodo ha la seguente sintassi:
 * 		<modificatori> <tipo> <nome> (<parametri formali>){
 * 			....
 * 		}
 * -->modificatori - di visibilit� (private, public..) o di appartenenza
 * a classe o istanze (static).
 * -->tipo - del risultato restituito dal metodo
 * -->nome - del metodo
 * -->parametri formali - lista (anche vuota) di coppie <tipo> <parametri>
 */

public class C02_Methods {

	/*
	 * I metodi  e la possibilit�  di definire variabili private consentono
	 * di limitare l'accesso allo stato di un oggetto.
	 */
	
	private int valore;
	
	public C02_Methods(int x) {
		valore = x;
	}
	
	public int getValore() {
		return valore;
		
		//La variabile di istanza valore potr� esssere acceduta 
		//solo in lettura
		
		//Tramite i metodi si pu� anche controllare la scrittura delle 
		//variabili private
		
		//modifica il valore solo se il nuovo valore � maggiore
		//restituisce TRUE se la modifica � stata fatta, FALSE altrimenti
	}	
		public boolean setValore(int nuovo) {
			if (nuovo > valore) {
				valore = nuovo;
				return true;
			}else 
				return false;
		}
	
}
