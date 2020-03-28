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
					"https://github.com/pcm-dpc/COVID-19/blob/master/schede-riepilogative/regioni/dpc-covid19-ita-scheda-regioni-20200327.pdf");

			BufferedReader reader = new BufferedReader(new InputStreamReader(pagina.openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter("prova_3.txt"));
			ArrayList<String> righe = new ArrayList<String>();
			Date date = new Date(System.currentTimeMillis());

			int i = 1;
			String inputLine;
			int prova;

			while ((inputLine = reader.readLine()) != null) {

				righe.add(inputLine);
				
				writer.write(inputLine);
				System.out.println(inputLine);
				i++;
			}
			reader.close();
			writer.close();

		} catch (IOException e) {
			System.out.println("ERRORE di I/O");
			System.out.println(e);
		}
	}

	public class Riga {

	}
}
