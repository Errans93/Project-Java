package Internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Covid {
	public static void main(String[] args) {

		try {

			URL pagina = new URL(
					"http://www.salute.gov.it/portale/nuovocoronavirus/dettaglioContenutiNuovoCoronavirus.jsp?lingua=italiano&id=5338&area=nuovoCoronavirus&menu=vuoto");

			BufferedReader reader = new BufferedReader(new InputStreamReader(pagina.openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter("covid-19.txt"));
			Date date = new Date(System.currentTimeMillis());

			int i = 1;
			String inputLine;

			while ((inputLine = reader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(inputLine, " ");

				while (st.hasMoreTokens()) {

					// System.out.println(st.nextToken());
					if (st.nextToken().equals("		<strong>Italia")) {
						
						writer.write(date + "   ----- -----   " + st.nextToken().substring(9, 15));
					}
				}

				// righe.add(inputLine);

				// for (String e : righe)

				// writer.write(st.nextToken());
				// System.out.println(inputLine);
				i++;
			}
			reader.close();
			writer.close();

		} catch (IOException e) {
			System.out.println("ERRORE di I/O");
			System.out.println(e);
		}
	}

}
