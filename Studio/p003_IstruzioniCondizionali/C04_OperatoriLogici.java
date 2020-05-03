package p003_IstruzioniCondizionali;

//Il problema C03_Orario si pu� anche risolvere con gli operatori logici e di confronto:

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
        
        
        int �psilon = 12;
        int zeta = 21;
        int eta = 12;
        
        System.out.println();
        System.out.println("�psilon < zeta? " + (�psilon < zeta)); // true
        System.out.println("�psilon < eta? " + (�psilon < eta)); // false
        System.out.println("�psilon <= eta? " + (�psilon <= eta)); // true

        System.out.println("�psilon > zeta? " + (�psilon > zeta)); // false
        System.out.println("�psilon > eta? " + (�psilon > eta)); // false
        System.out.println("�psilon >= eta? " + (�psilon >= eta)); // true

        System.out.println("�psilon == zeta? " + (�psilon == zeta)); // false
        System.out.println("�psilon == eta? " + (�psilon == eta)); // true

        System.out.println("�psilon != zeta? " + (�psilon != zeta)); // true
        System.out.println("�psilon != eta? " + (�psilon != eta)); // false
    }
}
