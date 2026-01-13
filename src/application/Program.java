package application;

import java.util.Scanner;

import entities.SudokuBoard;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SudokuBoard sb = new SudokuBoard(5);
		sb.generateNewBoard(5);
		
		for (int i = 0; i<100; i++) {
			cleanScreen();
			sb.showBoard();
			System.out.println();
			System.out.print("   Play: ");
			int play = scan.nextInt();
			cleanScreen();
			sb.showBoard();
			System.out.println();
			System.out.print("   s: ");
			int s = scan.nextInt();
			cleanScreen();
			sb.showBoard();
			System.out.println();
			System.out.print("   x: ");
			int x = scan.nextInt();
			System.out.print("   y: ");
			int y = scan.nextInt();
			sb.play(play, s, x, y);
		}
		scan.close();
	}
	
	public static void cleanScreen() {
		for(int i = 0; i<40; i++) {System.out.println();}
	}
	
	public static void clanScreen(int lines) {
		for(int i = 0; i<lines; i++) {System.out.println();}
	}
}