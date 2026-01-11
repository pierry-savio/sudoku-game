package entities;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard implements Sudoku {

	private int filledPlaces;
	private int emptyPlaces;

	public List<SudokuSquare> squares = new ArrayList<>();
	
	public SudokuBoard(int dificulty) {
		
		squares.add(new SudokuSquare());
		squares.add(new SudokuSquare());
		squares.add(new SudokuSquare());
		
		squares.add(new SudokuSquare());
		squares.add(new SudokuSquare());
		squares.add(new SudokuSquare());
		
		squares.add(new SudokuSquare());
		squares.add(new SudokuSquare());
		squares.add(new SudokuSquare());
		
		emptyPlaces = dificulty * 5;
		filledPlaces = 81 - emptyPlaces;
	}
	
	@Override
	public void play(int play, int square, int x, int y) {
		switch (square){
			case 0:
				squares.get(square).play(play, square, x, y);
			break;
			
			case 1:
				squares.get(square).play(play, square, x, y);
			break;
			
			case 2:
				squares.get(square).play(play, square, x, y);
			break;
			
			case 3:
				squares.get(square).play(play, square, x, y);
			break;
			
			case 4:
				squares.get(square).play(play, square, x, y);
			break;
			
			case 5:
				squares.get(square).play(play, square, x, y);
			break;
			
			case 6:
				squares.get(square).play(play, square, x, y);
			break;
			
			case 7:
				squares.get(square).play(play, square, x, y);
			break;
			
			case 8:
				squares.get(square).play(play, square, x, y);
			break;
		}
	}

	@Override
	public void showBoard() {
		
		int[][] square1 = squares.get(0).getBoard();
		int[][] square2 = squares.get(1).getBoard();
		int[][] square3 = squares.get(2).getBoard();
		
		int[][] square4 = squares.get(3).getBoard();
		int[][] square5 = squares.get(4).getBoard();
		int[][] square6 = squares.get(5).getBoard();
		
		int[][] square7 = squares.get(6).getBoard();
		int[][] square8 = squares.get(7).getBoard();
		int[][] square9 = squares.get(8).getBoard();
		
		String[] lines = new String[9];
		
		lines[0] = "|" + square1[0][0] + "|" + square1[1][0] + "|" + square1[2][0] + "| ";
		lines[0] += "|" + square2[0][0] + "|" + square2[1][0] + "|" + square2[2][0] + "| ";
		lines[0] += "|" + square3[0][0] + "|" + square3[1][0] + "|" + square3[2][0] + "|";
		lines[0] = lines[0].replace("0", "_");
		
		lines[1] = "|" + square1[0][1] + "|" + square1[1][1] + "|" + square1[2][1] + "| ";
		lines[1] += "|" + square2[0][1] + "|" + square2[1][1] + "|" + square2[2][1] + "| ";
		lines[1] += "|" + square3[0][1] + "|" + square3[1][1] + "|" + square3[2][1] + "|";
		lines[1] = lines[1].replace("0", "_");
		
		lines[2] = "|" + square1[0][2] + "|" + square1[1][2] + "|" + square1[2][2] + "| ";
		lines[2] += "|" + square2[0][2] + "|" + square2[1][2] + "|" + square2[2][2] + "| ";
		lines[2] += "|" + square3[0][2] + "|" + square3[1][2] + "|" + square3[2][2] + "|";
		lines[2] = lines[2].replace("0", "_");
		
		
		
		
		lines[3] = "|" + square4[0][0] + "|" + square4[1][0] + "|" + square4[2][0] + "| ";
		lines[3] += "|" + square5[0][0] + "|" + square5[1][0] + "|" + square5[2][0] + "| ";
		lines[3] += "|" + square6[0][0] + "|" + square6[1][0] + "|" + square6[2][0] + "|";
		lines[3] = lines[3].replace("0", "_");
		
		lines[4] = "|" + square4[0][1] + "|" + square4[1][1] + "|" + square4[2][1] + "| ";
		lines[4] += "|" + square5[0][1] + "|" + square5[1][1] + "|" + square5[2][1] + "| ";
		lines[4] += "|" + square6[0][1] + "|" + square6[1][1] + "|" + square6[2][1] + "|";
		lines[4] = lines[4].replace("0", "_");
		
		lines[5] = "|" + square4[0][2] + "|" + square4[1][2] + "|" + square4[2][2] + "| ";
		lines[5] += "|" + square5[0][2] + "|" + square5[1][2] + "|" + square5[2][2] + "| ";
		lines[5] += "|" + square6[0][2] + "|" + square6[1][2] + "|" + square6[2][2] + "|";
		lines[5] = lines[5].replace("0", "_");
		
		
		
		
		
		
		lines[6] = "|" + square7[0][0] + "|" + square7[1][0] + "|" + square7[2][0] + "| ";
		lines[6] += "|" + square8[0][0] + "|" + square8[1][0] + "|" + square8[2][0] + "| ";
		lines[6] += "|" + square9[0][0] + "|" + square9[1][0] + "|" + square9[2][0] + "|";
		lines[6] = lines[6].replace("0", "_");
		
		lines[7] = "|" + square7[0][1] + "|" + square7[1][1] + "|" + square7[2][1] + "| ";
		lines[7] += "|" + square8[0][1] + "|" + square8[1][1] + "|" + square8[2][1] + "| ";
		lines[7] += "|" + square9[0][1] + "|" + square9[1][1] + "|" + square9[2][1] + "|";
		lines[7] = lines[7].replace("0", "_");
		
		lines[8] = "|" + square7[0][2] + "|" + square7[1][2] + "|" + square7[2][2] + "| ";
		lines[8] += "|" + square8[0][2] + "|" + square8[1][2] + "|" + square8[2][2] + "| ";
		lines[8] += "|" + square9[0][2] + "|" + square9[1][2] + "|" + square9[2][2] + "|";
		lines[8] = lines[8].replace("0", "_");
		
		System.out.println(" _ _ _   _ _ _   _ _ _");
		for (int i = 0; i<lines.length; i++) {
			if (i != 2 && i != 5 && i != 8) {
				System.out.println(lines[i]);
			}
			else {
				System.out.println(lines[i]);
				if (i<8) {
					System.out.println(" _ _ _   _ _ _   _ _ _");
				}
			}
		}
	}

	@Override
	public boolean emptyPlace(int x, int y) {
		return false;
	}

	@Override
	public boolean allFilledPlaces() {
		return false;
	}

	@Override
	public boolean checkPlay(int play, int x, int y) {
		return false;
	}

	public int[][] generateNewBoard(int dificulty) {
		return null;
	}

}
