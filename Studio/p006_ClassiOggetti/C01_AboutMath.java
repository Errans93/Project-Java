package p006_ClassiOggetti;

/*
 * Avviamo visto come creare classi che includono metodi diversi
 * -->in particolare, metodi ausiliari che risolvono sottoproblemi.
 * Vedremo più avanti come realizzare programmi che condidtono di più
 * classi che si dividono il lavoro.
 * -->i metodi di una classe potranno invocare i metodi d un altra.
 * Per il momento vediamo come utilizzare classi gìa fatte.
 * La libreria standard di Java --> una enorme collezzione di classi già 
 * implementate.
 * 
 * Un metodo di un'altra classe si invoca così:
 * 
 * 		<nomedellaclasse>.<nomedelmetodo>(<parametri>);
 * 
 * Le clssi della libreria standard di Java sono organizzate in pacchetti
 * tematici. Ad esempio:
 * 
 * -->java.lang: contiene le classi più comunemente utilizzate (considerate
 * di base per il linguaggio).
 * -->java.util: contiene classi di utilità (strutture dati, data/ora...)
 * -->jaava.io: contiene classi per l'input/output (tramite console, file..)
 * -->java.awt e java.swing: contengono classe per costruire interfacce grafiche
 * -->java.security: contiene classi per crittografia e altri aspetti di sicurezza
 * -->...
 * ...
 * 
 * Le classi del pacchetto java.lang sono immediatamente disponibili
 * al programmatore. Le classi degli altri pacchetti devono essere
 * importate all'inizio del programma. Ad esempio:
 * 
 * 		import java.util.Scanner; --> importa la classe Scanner
 * 		import java.util.*; --> importa tutto il pacchetto 
 * 
 * Esempio di una classe del pacchetto java.lang: LA CLASSE MATH.
 * Questa contiene numerosi metodi che eseguono calcoli aritmetici.
 */

public class C01_AboutMath {
	public static void main(String[] args) {
        System.out.println("E is " + Math.E);
        System.out.println("PI is " + Math.PI);
        
        System.out.println("abs: " + Math.abs(-13.4));
        System.out.println("ceil: " + Math.ceil(23.1));
        System.out.println("cos: " + Math.cos(2 * Math.PI));
        System.out.println("exp: " + Math.exp(Math.PI));
        System.out.println("floor: " + Math.floor(23.9));
        System.out.println("log: " + Math.log(Math.E));
        System.out.println("max: " + Math.max(2.3001, 2.30001));
        System.out.println("min: " + Math.min(2.3001, 2.30001));
        System.out.println("pow: " + Math.pow(2, 3));
        System.out.println("random: " + Math.random());
        System.out.println("round: " + Math.round(2.4999));
        System.out.println("square root: " + Math.sqrt(121));
        System.out.println("to degrees: " + Math.toDegrees(Math.PI));
        System.out.println("to radians: " + Math.toRadians(180));
        
        
        //Esempio di uso:
        //-->genero un numero casuale tra 0.0 e 1.0 e lo stampo
        double numeroCasuale = Math.random();
        System.out.println("Numero casuale: " + numeroCasuale);
        
        //-->lo trasformo in un numero casuale tra 0.0 e 10.0
        numeroCasuale = numeroCasuale*10;
        System.out.println("(Numero casuale) * 10: " + numeroCasuale);
        
        //-->lo trasformo in un numero casuale tra 1.0 e 10.0 senza decimali
        numeroCasuale = Math.ceil(numeroCasuale);
        System.out.println("Numero casuale traformato in intero: " + numeroCasuale);
        
        //-->ne calcolo il quadrato e lo stampo
        System.out.println("Quadrato del numero intero: " + Math.pow(numeroCasuale, 2));
        
    }
}
