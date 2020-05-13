package p009_CostruttoriMetodi;

public class C07_UsaPunto {
	public static void main(String[] args) {

		C07_Punto p1 = new C07_Punto(3, 6);
		C07_Punto p2 = new C07_Punto(13);
		C07_Punto p3 = new C07_Punto(3, 6, 9);

		System.out.println(p1.x);
		System.out.println(p1.y);
		System.out.println(p1.k);
		
		System.out.println(p2.x);
		System.out.println(p2.y);
		System.out.println(p2.k);
		
		System.out.println(p3.x);
		System.out.println(p3.y);
		System.out.println(p3.k);

	}

}
