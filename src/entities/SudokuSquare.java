package entities;

public class SudokuSquare implements Sudoku {

	private int[][] board = new int[3][3];
	
	private int filledPlaces;
	private int emptyPlaces;
	
	public SudokuSquare() {
		emptyPlaces = 9;
		filledPlaces = 9 - emptyPlaces;
	}
	
	public SudokuSquare(int[][] board) {
		this.board = board;
		emptyPlaces = 9;
		filledPlaces = 9 - emptyPlaces;
	}

	public int[][] getBoard(){
		return board;
	}
	
	public int getFilledPlaces() {
		filledPlaces = 9 - emptyPlaces;
		return filledPlaces;
	}

	public int getEmptyPlaces() {
		return emptyPlaces;
	}

	@Override
	public void play(int play, int square, int x, int y) {
		if (checkPlay(play, x, y)) { 
			board[y][x] = play;
			emptyPlaces--;
		}
	}

	@Override
	public void showBoard() {
		
		String result = " _ _ _" + "\n";
		
		for (int i = 0; i<board.length; i++) {
			for (int j = 0; j<board[0].length; j++) {
				if (board[i][j] != 0) {
					result += "|" + board[i][j];
				}
				else {
					result += "|_";
				}
			}
			if (i<board.length-1) {
				result += "| \n";
			}
			else {
				result += "|";
			}
		}
		System.out.println(result);
	}

	@Override
	public boolean emptyPlace(int x, int y) {
		return (board[y][x] == 0) ? true : false;
	}
	
	public boolean numberAlreadyUsed(int number) {
		
		boolean used = false;
		
		for (int i = 0; i<board.length; i++) {
			for (int j = 0; j<board[0].length; j++){
				if (board[i][j]==number) {
					used = true;
				}
			}
		}
		return used;
	}
	
	@Override
	public boolean allFilledPlaces() {
		
		for (int i = 0; i<board.length; i++) {
			for (int j = 0; j<board[0].length; j++){
				if (board[i][j]==0) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean checkPlay(int play, int x, int y) {
		if (emptyPlace(x,y) && numberAlreadyUsed(play)==false) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		String result = " _ _ _" + "\n";
		
		for (int i = 0; i<board.length; i++) {
			for (int j = 0; j<board[0].length; j++) {
				if (board[i][j] != 0) {
					result += "|" + board[i][j];
				}
				else {
					result += "|_";
				}
			}
			if (i<board.length-1) {
				result += "| \n";
			}
			else {
				result += "|";
			}
		}
		return result;
	}
}
