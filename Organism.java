/**
 *	PROGRAMMING WRITERS: Shane Byrne, Akhil Bharadhawai, Rachel Clearly, Travis Porter, Matthew Nguyen, David Ramirez
 *	CS112 Tuesday 05:30-09:20pm
**/

// This class describes an Organism
import java.util.*;
public abstract class Organism
{
	public int locationX;
	public int locationY;
	//public GridPieces location;
	public int moveCount;
	public char status = 'e';
	public Organism[][] grid = new Organism[20][20];
		
	
	// construct an Organism
	public Organism(int x, int y)
	{
		locationX = x;
		locationY = y;
		moveCount = 0;
	}
	public Organism(GridPieces location)
	{	
		//this.locationX = x;
		//this.locationY = y;
		this.location = new GridPieces(location);
		moveCount = 0;
	}
	
	// method to breed
	public abstract void breed();
	
	// method to move
	public abstract void move();
}