// This class describes a Dog that inherits from the Animal class

public class DoodleBug extends Organism
{
	public static int doodlebugCount = 0;
	int eatCount;
	// construct a DoodleBug
	public DoodleBug(GridPieces other)
	{	
		super(other);
		doodlebugCount++;
	}
	
	// method to breed
	public void breed()
	{
		//If move count is =8, run method
		//If occupied, re-roll.
		//If impossible, no breeding.
		//If possible, create doodlebug adjacent.
		//If create DoodleBug on Ant, kill ant
	}
	
	// method to move
	public void move()
	{
		//Insert random number
		//Insert direction to move.
		//If occupied by ant kill ant.
		//If occupied by Doodlebugs or out of bounds, then no move.
		//Reassign position on board
		//Insert move counter
		//If ant is eaten, reset eatCount.
	}
	
	public void starve()
	{
		//If eatCount =3, the kill DoodleBug.
	}	
}