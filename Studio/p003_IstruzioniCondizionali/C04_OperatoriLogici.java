package p003_IstruzioniCondizionali;

//Il problema C03_Orario si può anche risolvere con gli operatori logici e di confronto:

public class C04_OperatoriLogici {

	public static void main(String[] args) {
        boolean alpha = true;
        boolean beta = false;

        System.out.println(alpha && beta);
        System.out.println(alpha || beta);
        System.out.println(!alpha);
        System.out.println(alpha & beta);
        System.out.println(alpha | beta);

        int gamma = 0b101;
        int delta = 0b110;
        
        System.out.println();
        System.out.println(gamma & delta);
        System.out.println(gamma | delta); 
        System.out.println(gamma ^ delta);
        
        
        int épsilon = 12;
        int zeta = 21;
        int eta = 12;
        
        System.out.println();
        System.out.println("épsilon < zeta? " + (épsilon < zeta)); // true
        System.out.println("épsilon < eta? " + (épsilon < eta)); // false
        System.out.println("épsilon <= eta? " + (épsilon <= eta)); // true

        System.out.println("épsilon > zeta? " + (épsilon > zeta)); // false
        System.out.println("épsilon > eta? " + (épsilon > eta)); // false
        System.out.println("épsilon >= eta? " + (épsilon >= eta)); // true

        System.out.println("épsilon == zeta? " + (épsilon == zeta)); // false
        System.out.println("épsilon == eta? " + (épsilon == eta)); // true

        System.out.println("épsilon != zeta? " + (épsilon != zeta)); // true
        System.out.println("épsilon != eta? " + (épsilon != eta)); // false
    }
}
