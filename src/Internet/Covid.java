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

public class Covid {
	public static void main(String[] args) {

		try {

			URL cg = new URL(
					"http://www.salute.gov.it/portale/nuovocoronavirus/dettaglioContenutiNuovoCoronavirus.jsp?lingua=italiano&id=5338&area=nuovoCoronavirus&menu=vuoto");

			BufferedReader reader = new BufferedReader(new InputStreamReader(cg.openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter("covid-19.txt"));

			int i = 1;
			String inputLine;
			int prova;
			
			Date date = new Date(System.currentTimeMillis());
			
			while ((inputLine = reader.readLine()) != null) {
		
				if (i == 310) {
					String outputLine = inputLine.substring(26, 32);
					System.out.println(date + "  ---- ----  " + outputLine);
					writer.write(date + "  ---- ----  " + outputLine);
				}
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
