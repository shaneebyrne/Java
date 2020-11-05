

public class GridPieces 
{
	char Status;
	int x, y;
	GridPieces left, right, up, down;
	l
	
	public GridPieces(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.Status = 'e';
	}
	
	public GridPieces(GridPieces other)
	{
		this.x = other.x;
		this.y = other.y;
	}
	public void changeStatusE()
	{
		// Change to E if starve or moved from
		Status = 'e';
	}
	
	public void changeStatusA()
	{
		// Change to A if move or breed
		Status = 'a';
	}
	
	public void changeStatusD()
	{
		// Change to D if move or breed or eat
		Status = 'd';
	}
	
	public char getStatus()
	{
		return Status;
	}
}

