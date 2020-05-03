package p004_CicliIterativi;

//Quando si usano cicli questi tipi di assegnamenti diventano frequenti:
//somma = somma + numero
//contatore = contatore + 1

//Per questo motivo in java esistono dei comandi di assegnamento ausiliari 
//(abbreviazioni sintattiche) che semplificano un pò la scrittura.
//-->(somma += numero) == (somma = somma + numero) --> TRUE
//-->(contatore ++) == (contatore = contatore + 1) --> TRUE

//In maniera analoga vediamo i seguenti esempi

public class C02_Assignment {
	public static void main(String[] args) {
        int alpha = 2;

        alpha += 8;
        System.out.println(alpha);

        alpha -= 3;
        System.out.println(alpha);

        alpha *= 2;
        System.out.println(alpha);

        alpha /= 2;
        System.out.println(alpha);

        alpha %= 5;
        System.out.println(alpha);
        
        int value = 1;

        System.out.println(value); // 1

        System.out.println(++value); // 2 PRIMA somma POI stampa
        System.out.println(--value); // 1 PRIMA sottrai POI stampa

        System.out.println(value++); // 1 SOMMA 1 a value
        System.out.println(value); // 2
        System.out.println(value--); // 2 Sottrai 1 a value
        System.out.println(value); // 1
        
        System.out.println(-value); // -1 Cambia segno
        System.out.println(+value); // 1 Cambia segno
        
    }
}
