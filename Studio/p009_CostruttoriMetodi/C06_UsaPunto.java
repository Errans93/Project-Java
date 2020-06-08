package p009_CostruttoriMetodi;

public class C06_UsaPunto {
	public static void main(String[] args) {
		C06_Punto p1 = new C06_Punto(3, 6);
		C06_Punto p2 = new C06_Punto(13, 10);
		
		C06_Punto min = p1.minimo(p2);
		
		if (min.equals(p1)) {
			System.out.println("Il punto minimo è p1");
		}else
			System.out.println("Il punto minimo è p2");
	}

}
