package entities;

public interface Sudoku {
	
	public void showBoard();
	public boolean allFilledPlaces();
	public boolean checkPlay(int play, int x, int y);
	
}