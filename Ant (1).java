// Ant class

class Ant extends Organism
{
	public static final int ANTBREED = 3;	// How many ticks to breed an ant

    	// Constructors
 	public Ant()
 	{
		super();
	}

	public Ant(World world, int x, int y)
	{
		super(world,x,y);
	}

	// Ant breed
	/* Increment the tick count for breeding.
	* If it equals our threshold, then clone this ant either
	* above, right, left, or below the current one.*/
	
             public void breed()			// Must define this since virtual
	{
		breedTicks++;
		if (breedTicks == ANTBREED)
		{
			breedTicks = 0;
			// Try to make a new ant either above, left, right, or down
			if ((y>0) && (world.getAt(x,y-1)==null))
			{
				Ant newAnt = new Ant(world, x, y-1);
			}
			else if ((y<World.WORLDSIZE-1) && (world.getAt(x,y+1)==null))
			{
				Ant newAnt = new Ant(world, x, y+1);
			}
			else if ((x>0) && (world.getAt(x-1,y)==null))
			{
				Ant newAnt = new Ant(world, x-1, y);
			}
			else if ((x<World.WORLDSIZE-1) && (world.getAt(x+1,y)==null))
			{
				Ant newAnt = new Ant(world, x+1, y);
			}
		}
	}

	// Ant Move
	// Look for an empty cell up, right, left, or down and
	//try to move there.
	public void move()			// Must define this since virtual
	{
		// Pick random direction to move
		int dir = (int) (Math.random() * 4);
		// Try to move up, if not at an edge and empty spot
		if (dir==0)
		{
			if ((y>0) && (world.getAt(x,y-1)==null))
			{
			 world.setAt(x,y-1,world.getAt(x,y));  // Move to new spot
			 world.setAt(x,y,null);
			 y--;
			}
		}
		// Try to move down
		else if (dir==1)
		{
			if ((y<World.WORLDSIZE-1) && (world.getAt(x,y+1)==null))
			{
			 world.setAt(x,y+1,world.getAt(x,y));  // Move to new spot
			 world.setAt(x,y,null);  // Set current spot to empty
			 y++;
			}
		}
		// Try to move left
		else if (dir==2)
		{
			if ((x>0) && (world.getAt(x-1,y)==null))
			{
			 world.setAt(x-1,y,world.getAt(x,y));  // Move to new spot
			 world.setAt(x,y,null);  // Set current spot to empty
			 x--;
			}
		}
		// Try to move right
		else
		{
			if ((x<World.WORLDSIZE-1) && (world.getAt(x+1,y)==null))
			{
			 world.setAt(x+1,y,world.getAt(x,y));  // Move to new spot
			 world.setAt(x,y,null);  // Set current spot to empty
			 x++;
			}
		}
	}

	// Return false since an ant never starves
	public boolean starve()
	{
		  return false;
	}

	// an Ant is represented by "o"
	public String getPrintableChar()
	{
		return "o";
	}
} 