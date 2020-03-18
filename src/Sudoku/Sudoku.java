package Sudoku;



import java.util.Scanner;

public class Sudoku {

	public static void main(String args[]) {
		SudokuSolve sudokuSolves;
		Scanner scan = new Scanner(System.in);
		//int sudoku[][] = new int[9][9];
		new SudokuSolve(new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } });
		
		sudokuSolves = SudokuSolve.enterSudokuData(scan, 8);
		sudokuSolves = SudokuSolve.printSudoku(8);
		sudokuSolves = SudokuSolve.solve();
		

	}
}
