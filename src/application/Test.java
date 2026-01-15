package application;

import java.util.Scanner;

import entities.SudokuBoard;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SudokuBoard sb = new SudokuBoard();
		
		cleanScreen();
		sb.showBoard();
		scan.close();
	}
	
	public static void cleanScreen() {
		for(int i = 0; i<40; i++) {System.out.println();}
	}
	
	public static void clanScreen(int lines) {
		for(int i = 0; i<lines; i++) {System.out.println();}
	}
}