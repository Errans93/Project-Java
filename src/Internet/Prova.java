package Internet;

import java.net.*;
import java.io.*;

public class Prova {
	public static void main(String[] args) {

		try {

			URL cg = new URL(
					"http://www.salute.gov.it/portale/nuovocoronavirus/dettaglioContenutiNuovoCoronavirus.jsp?lingua=italiano&id=5338&area=nuovoCoronavirus&menu=vuoto");

			BufferedReader reader = new BufferedReader(new InputStreamReader(cg.openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter("prova.txt"));

			int i = 1;
			String inputLine;
			String compassione;
			while ((inputLine = reader.readLine()) != null) {
				System.out.println(inputLine + i);
				System.out.println();
				String prova = inputLine;
				String prova1 = prova.substring(1, 2);
				if (i == 310) {
					String outputLine = inputLine.substring(26, 32);
					System.out.println(outputLine);
					writer.write(outputLine);
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
	public static String removeCh (String s , int index) {
		if ((index > s.length()-1) || (index < 0)) return null;
		String c = s.substring(0,index) + s.substring(index+1 , s.length());
		return c;
		}
}
