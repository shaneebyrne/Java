// This class describes a Dog that inherits from the Animal class

import java.util.*;
public class Ant extends Organism
{
	// construct an ant
	public static int antCount = 0;
	public int moveCount = 0;
	//public GridPieces location;
	
	public Ant(int x, int y)
	{
		super(x, y);
		//locationX = x;
		//locationY = y;
		moveCount = 0;
	}
	/*public Ant(GridPieces location)
	{	
		super(location);
		antCount++;
	}*/
	
	// method to breed
	public void breed()
	{
		//If move count is =3, run method
		
		
		if(moveCount==3)
		{
			int tempX = locationX;
			int tempY = locationY;
			tempY -= 1;
			if(grid[locationX][tempY].status == 'e')
			{
				grid[locationX][tempY].status = 'a';
			}
			else if
		}
		/*{
			int tempX = locationX;
			int tempY = locationY;
			//Move ant up
			locationY -= 1;
			Ant antCopy = new Ant(locationX, locationY);
			if(this.equals(antCopy))
			{
				antCopy.exterminate();
				locationX = tempX;
				locationY = tempY;
			}
			
			else if(check == true)
			{
				locationY += 1;
				 antCopy = new Ant(locationX, locationY);
			}
			else if(location.getStatus()=='e')
			{
				locationX -= 1;
				 antCopy = new Ant(locationX, locationY);
			}
			else if(location.getStatus()=='e')
			{
				locationX += 1;
				 antCopy = new Ant(locationX, locationY);
			}
			
			
		}*/
		
	}
	
	// method to move
	public void move()
	{
		//Insert random number
		int num = (int)(Math.random()*4) + 1;
		//Insert direction to move.
		if(num == 1)
		{
			//location.changeStatusE();
			
		}
		//If occupied or out of bounds, then no move.
		//Reassign position on board
		//Insert move counter
	}
	public void exterminate()
	{
		locationX = 100;
		locationY = 100;
	}
	public boolean equals(Ant other)
	{
		return((this.locationX == other.locationX) & (this.locationY == other.locationY));
	}	
}