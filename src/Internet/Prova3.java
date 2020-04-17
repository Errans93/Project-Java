package Internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Date;
import java.util.*;

public class Prova3 {
	public static void main(String[] args) {

		try {

			URL pagina = new URL(
					"http://www.salute.gov.it/portale/nuovocoronavirus/dettaglioContenutiNuovoCoronavirus.jsp?lingua=italiano&id=5338&area=nuovoCoronavirus&menu=vuoto");

			BufferedReader reader = new BufferedReader(new InputStreamReader(pagina.openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter("prova_3.txt"));
			// Date date = new Date(System.currentTimeMillis());
			List<String> list = new LinkedList<String>();

			int i = 1;
			String inputLine;

			while ((inputLine = reader.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(inputLine, " ");

				while (st.hasMoreTokens()) {

					String str = st.nextToken();
					list.add(str);
					list.add("\n");

					writer.write(str);
					writer.write("\n");
				}

				i++;
			}

			System.out.println(list.size());

			List<String> sub = list.subList(1950, 2000);

			//System.out.println(sub);
			boolean flag = true;
			int j = 0;
			do {
				
				
				StringTokenizer st = new StringTokenizer(sub.get(j), "#");

				while (st.hasMoreTokens()) {

					String str = st.nextToken();
					
					System.out.println(str);
				}
				if (j == 49) {
					
					flag = false;
					
				}
				j++;
			
			} while(flag);

			reader.close();
			writer.close();

		} catch (IOException e) {
			System.out.println("ERRORE di I/O");
			System.out.println(e);
		}
	}

	private static char[] next(StringTokenizer st) {
		// TODO Auto-generated method stub
		return null;
	}

}