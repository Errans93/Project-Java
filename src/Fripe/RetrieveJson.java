package Fripe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RetrieveJson {
	public static void main(String[] args) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("playerlabelling.json"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("prova.json"));
			
			String inputLine;
			while ((inputLine = reader.readLine()) != null) {
				System.out.println(inputLine);
				writer.write(inputLine);
				writer.write("\n");
			}
			reader.close();
			writer.close();
			
		} catch (IOException e) {
			System.out.println("ERRORE di I/O");
			System.out.println(e);
		}
	}
}
