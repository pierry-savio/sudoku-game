package application;

import entities.SudokuBoard;

public class Program {

	public static void main(String[] args) {
		/*
		System.out.println(" _ _ _   _ _ _   _ _ _");
		System.out.println("|_|_|_| |_|_|_| |_|_|_|");
		System.out.println("|_|_|_| |_|_|_| |_|_|_|");
		System.out.println("|_|_|_| |_|_|_| |_|_|_|");
		System.out.println(" _ _ _   _ _ _   _ _ _");
		System.out.println("|_|_|_| |_|_|_| |_|_|_|");
		System.out.println("|_|_|_| |_|_|_| |_|_|_|");
		System.out.println("|_|_|_| |_|_|_| |_|_|_|");
		System.out.println(" _ _ _   _ _ _   _ _ _");
		System.out.println("|_|_|_| |_|_|_| |_|_|_|");
		System.out.println("|_|_|_| |_|_|_| |_|_|_|");
		System.out.println("|_|_|_| |_|_|_| |_|_|_|");
		
		
		SudokuBoard sb = new SudokuBoard(0);
		sb.showBoard();
		*/
		
		SudokuBoard sb = new SudokuBoard(5);
		
		sb.play(7, 8, 2, 2);
		sb.play(5, 8, 1, 2);
		sb.showBoard();
		
		
	}
}
