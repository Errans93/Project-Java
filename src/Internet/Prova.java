package Internet;

import java.net.*;
import java.io.*;

public class Prova {
	public static void main(String[] args) {
			//throws Exception {
		try {
			int inputLine;
		URL cg = new URL(
				"http://www.salute.gov.it/portale/nuovocoronavirus/dettaglioContenutiNuovoCoronavirus.jsp?lingua=italiano&id=5338&area=nuovoCoronavirus&menu=vuoto");
		BufferedReader reader = new BufferedReader(new InputStreamReader(cg.openStream()));
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("prova.txt"));
		
	//	String inputLine;
	//	while ((inputLine = reader.readLine()) != null)
	//		System.out.println(inputLine);
	//	reader.close();
		do {
			inputLine = reader.read();	
			if (inputLine != 1) {
				char c = (char) inputLine;
				writer.write(c);
			}
		} while (inputLine != -1);
		reader.close();
		writer.close();
			
		}
		catch (IOException e) {
			System.out.println("ERRORE di I/O");
			System.out.println(e);
		}
	}
}
