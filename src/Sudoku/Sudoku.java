package Sudoku;



import java.util.Scanner;

public class Sudoku {

	public static void main(String args[]) {
		SudokuSolve sudokuSolves;
		Scanner input = new Scanner(System.in);
		//int sudoku[][] = new int[9][9];
		new SudokuSolve(new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } });
		
		SudokuSolve.enterSudokuData(input, 8);
		SudokuSolve.printSudoku(8);
		SudokuSolve.solve();
		

	}
}
