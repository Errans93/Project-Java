package p009_CostruttoriMetodi;

public class C03_Finestra {
	// variabile a cui NON vogliamo dare l'accesso al pubblico
	private C03_Rettangolo area;
	
	public C03_Finestra() {
		area = new C03_Rettangolo(20, 30);
	}
	
	public C03_Rettangolo getArea() {
		return area;
	}
}
