// Organism.java

/* Definition for the Organism base class.
*  Each organism has a reference back to
*  the World object so it can move itself
*  about in the world.*/

abstract class Organism
{
	protected int x,y;		// Position in the world
	protected boolean moved;	// Bool to indicate if moved this turn
	protected int breedTicks;	// Number of ticks since breeding
	protected World world;	// Reference to the world object so we can update its
					// grid when we move around in the world
  	// Constructors
 	public Organism()
	{
		world = null;
		moved = false;
		breedTicks = 0;
		x=0;
		y=0;
	}

	public Organism(World world, int x, int y)
	{
		this.world = world;
		moved = false;
		breedTicks = 0;
		this.x=x;
		this.y=y;
		world.setAt(x,y,this);
	}

  	//Accessor/Mutator for the Moved variable

 	public boolean getMoved()
	{
		return moved;
	}

	public void setMoved(boolean moved)
	{
		this.moved = moved;
	}

    // Determines whether or not this organism should breed
	public abstract void breed();

	// Determines how this organism should move
	public abstract void move();

	// Determines if this organism starves
	public abstract boolean starve();

	// Returns a symbol for the organism
	public abstract String getPrintableChar();
} 