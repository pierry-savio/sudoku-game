package application;

import java.util.Scanner;

import entities.SudokuBoard;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SudokuBoard sb = new SudokuBoard(5);
		
		for (int i = 0; i<100; i++) {
			cleanScreen();
			sb.showBoard();
			System.out.println("Todos os campos preenchidos? " + sb.allFilledPlaces());
			System.out.println("Campos vazios: " + sb.getQuantityOfEmptyPlaces());
			System.out.println("Campos preenchidos: " + sb.getQuantityOfFilledPlaces());
			System.out.print("Play: ");
			int play = scan.nextInt();
			System.out.print("s: ");
			int s = scan.nextInt();
			System.out.print("x: ");
			int x = scan.nextInt();
			System.out.print("y: ");
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