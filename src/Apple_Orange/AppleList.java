package Apple_Orange;

import java.util.*;

public class AppleList {

	public static void main(String[] args) {

		ArrayList apples = new ArrayList();
		ArrayList oranges = new ArrayList();

		for (int i = 0; i < 20; i++) {
			apples.add(new Apple("Colore"));
		}

		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Di che colore sono le tue mele?");
		System.out.println();

		oranges.add(new Orange());

		for (int i = 0; i < apples.size(); i++) {
			String colore = input.next();
			((Apple) apples.get(i)).setColore(colore);  //con il metodo get() accedo agli elementi di apples ma devo castare a Apple per usare
														// i suoi metodi come setColore().
			System.out.println();
			System.out.println("Il colore della mela " + (i + 1) + " sarà " + colore);
			System.out.println();
		}
		
	}

}

class Apple {
	private String colore;
	private static long counter;
	private final long id = counter++;

	public Apple(String colore) {
		this.colore = colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public long id() {
		System.out.println(id);
		return id;
	}

}

class Orange {
}