package entities;

public interface Sudoku {
	
	public void play(int play, int square, int x, int y);
	public void showBoard();
	public boolean emptyPlace(int x, int y);
	public boolean allFilledPlaces();
	public boolean checkPlay(int play, int x, int y);
	
}
