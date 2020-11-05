import java.util.*;

public class GridBoard
{
	public GridBoard(int x, int y)
	{
		GridPieces[][] board = new GridPieces[x][y];
	}
	
	public static void main(String[] args)
	{
		GridBoard game = new GridBoard(20, 20);
		Ant test = new Ant(game[1][3]);
	}
}