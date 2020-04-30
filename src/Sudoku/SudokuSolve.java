package Sudoku;

import java.util.Scanner;

public class SudokuSolve {

	public static  int sudoku[][];
	public static int n = 9;

	public SudokuSolve(int sudoku[][]) {
		this.sudoku = sudoku;
	}

	// metodo per il quale riesco a inserire i dati nel mio array di partenza
	// sudoku[][]
	public static void enterSudokuData(Scanner scan, int n) {
		System.out.println("Inserisci i dati del sudoku (dove non conosci il dato metti 0):");
		System.out.println("");
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.println("");
				System.out.println(" Numero della riga = " + (i + 1) + " e della colonna = " + (j + 1));
				System.out.println("");
				sudoku[i][j] = scan.nextInt();
				if (sudoku[i][j] < 0 || sudoku[i][j] > 9) {
					j = j - 1;
					System.out.println("");
					System.out.println("I numeri da inserire dentro il sudoku possono andare solo da 0 a 9. "
							+ "Metti il numero giusto");
					System.out.println(" ");
				}
			}

		}
	}

//metodo per il quale riesco a stampare tutto il sudoku di partenza
	public static SudokuSolve printSudoku(int n) {
		System.out.println("Il sudoku iniziale è: ");

		System.out.println("             -------------------------------------");
		for (int i = 0; i <= n; i++) {
			System.out.print("            ");
			for (int j = 0; j <= n; j++) {
				if (sudoku[i][j] == 0) {
					System.out.print(" | " + "x");
				} else {
					System.out.print(" | " + sudoku[i][j]);
				}
			}
			System.out.print(" |");
			System.out.println();
			System.out.println("             -------------------------------------");

		}
		return null;

	}

//metodo che mi stampa il sudoku a meno che non sia risolvibile (backtrackSolve falso)
	public static SudokuSolve solve() {
		if (!backtrackSolve()) {
			System.out.println("Questo sudoku non può essere risolto.");
		} else {
			System.out.println(" ");
			System.out.println("La soluzione è: ");
			System.out.println(" ");
			System.out.println("             -------------------------------------");
			for (int i = 0; i < n; i++) {
				System.out.print("            ");
				for (int j = 0; j < n; j++) {
					System.out.print(" | " + sudoku[i][j]);
				}
				System.out.print(" |");
				System.out.println();
				System.out.println("             -------------------------------------");
			}
		}
		return null;
	}

	public static boolean backtrackSolve() {
		int i = 0, j = 0;
		boolean cellaVuota = false;
		for (int ii = 0; ii < n && !cellaVuota; ii++) {
			for (int jj = 0; jj < n && !cellaVuota; jj++) {
				if (sudoku[ii][jj] == 0) {
					cellaVuota = true;
					// System.out.println("Stampo ii " + ii + " Stampo jj " + jj);
					i = ii;
					j = jj;
				}
			}
		}
		if (!cellaVuota) {
			return true;
		}
		for (int x = 1; x < 10; x++) {
			if (isSuitableToPutXThere(i, j, x)) {
				sudoku[i][j] = x;
				if (backtrackSolve()) {
					return true;
				}
				sudoku[i][j] = 0;
			}
		}
		return false;
	}

	public static boolean isSuitableToPutXThere(int i, int j, int x) {
		// Is 'x' used in row.
		for (int jj = 0; jj < n; jj++) {
			if (sudoku[i][jj] == x) {
				return false;
			}
		}
		// Is 'x' used in column.
		for (int ii = 0; ii < n; ii++) {
			if (sudoku[ii][j] == x) {
				return false;
			}
		}
		// Is 'x' used in sudoku 3x3 box.
		int boxRighe = i - i % 3;
		int boxColonne = j - j % 3;

		for (int ii = 0; ii < 3; ii++) {
			for (int jj = 0; jj < 3; jj++) {
				if (sudoku[boxRighe + ii][boxColonne + jj] == x) {
					return false;
				}
			}
		}
		return true;
	}

}
