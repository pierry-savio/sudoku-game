package application;

import java.util.Random;

import entities.SudokuBoard;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {

		SudokuBoard sb = new SudokuBoard(5);
		Random rand = new Random();
		
		while (sb.allFilledPlaces() == false) {
			System.out.println();
			int play = rand.nextInt(1,10);
			int s = rand.nextInt(0,9);
			int x = rand.nextInt(0,3);
			int y = rand.nextInt(0,3);
			
			while (!sb.emptyPlace(s, x, y)) {
				s = rand.nextInt(0,9);
				x = rand.nextInt(0,3);
				y = rand.nextInt(0,3);
			}
			
			sb.play(play, s, x, y);
			System.out.println("      S U D O K U");
			sb.showBoard();
			
		}
		System.out.println("Casas preenchidas: " + sb.getQuantityOfFilledPlaces());
	}
	
	public static void cleanScreen() {
		for(int i = 0; i<40; i++) {System.out.println();}
	}
	
	public static void clanScreen(int lines) {
		for(int i = 0; i<lines; i++) {System.out.println();}
	}
}
