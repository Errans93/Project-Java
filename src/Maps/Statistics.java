package Maps;

import java.util.*;

public class Statistics {
	public static void main(String[] args) {
		
	Random rand = new Random(2);
	Map<Integer,Integer> m = new HashMap<Integer,Integer>();
	
	for (int i = 0 ; i < 10 ; i++ ) {
	//Il Produce un numero tra O e 20:
	
		int r = rand.nextInt(4) ;
		
		System .out.println();
		System .out.println("rand.nextInt(4) = " + rand.nextInt(4));
		System .out.println();
		
		System .out.println();
		System .out.println("rand = " + rand);
		System .out.println();
		
		System .out.println();
		System .out.println("r = " + r);
		System .out.println();
		
		Integer freq = m.get(r);
		
		System .out.println();
		System .out.println("m..get(r) = " + m.get(r));
		System .out.println();
		
		m.put(r, (freq == null ? 1 : freq + 1));
	
		System .out.println();
		System .out.println("freq = " + freq);
		System .out.println();
		
		System .out.println();
		System .out.println("(freq == null ? 1 : freq + 2) = " + (freq == null ? 1 : freq + 1));
		System .out.println();
		
		System .out.println();
		System .out.println("i = " + i);
		System .out.println();
		System .out.println(" ------------------------------------ " );
		System .out.println();
	}
	System .out.println(m);
	}

}
