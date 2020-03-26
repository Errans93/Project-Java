package Internet;

import java.net.*;
import java.io.*;

public class Prova2 {
	public static void main(String[] args) {
		// throws Exception {

		// 13392 <str 13396 ong> 13400 Ital 13404 ia < 13408 /str 13412 ong> 13416 74.3
		// 13420 86&# 13424 160; 13428 casi 13432 , 7. 13436 503 13440 mort 13444 i *
		try {
			int inputLine;
			URL cg = new URL(
					"http://www.salute.gov.it/portale/nuovocoronavirus/dettaglioContenutiNuovoCoronavirus.jsp?lingua=italiano&id=5338&area=nuovoCoronavirus&menu=vuoto");
			BufferedReader reader = new BufferedReader(new InputStreamReader(cg.openStream()));

			BufferedWriter writer = new BufferedWriter(new FileWriter("prova2.txt"));
			int i = 0;
			do {
				inputLine = reader.read();
				if (inputLine != 1) {
					char c = (char) inputLine;
					// writer.write(c);
					// System.out.println(c + " " + i);
					String parola = (c + " " + i + " ");
					if (i % 4 == 0) {
						// System.out.println(parola);
						// writer.write(parola);
					} else {
						// System.out.println(c);
						// writer.write(c);}
					}
					

					if (i == 13621) {
						System.out.print(c);
						writer.write(c);
					}

					if (i == 13622) {
						System.out.print(c);
						writer.write(c);
					}

					if (i == 13623) {
						System.out.print(c);
						writer.write(c);
					}

					if (i == 13624) {
						System.out.print(c);
						writer.write(c);
					}

					if (i == 13625) {
						System.out.print(c);
						writer.write(c);
					}
					
					if (i == 13626) {
						System.out.print(c);
						writer.write(c);
					}
					
					
					
					
					
					

					i++;
				}
			} while (inputLine != -1);
			reader.close();
			writer.close();

		} catch (

		IOException e) {
			System.out.println("ERRORE di I/O");
			System.out.println(e);
		}
	}
}
