package application;

import java.util.Scanner;

import entities.SudokuBoard;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SudokuBoard sb = new SudokuBoard(5);
		
		while (true) {
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
	}
}
