
public class Location 
{
	int maxX, maxY;
	int x, y;
	public Location(int x, int y)
	{
		maxX = 8;
		maxY = 8;
		
		this.x = x;
		this.y = y;
		
		
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public boolean equals(Location other)
	{
		return x == other.x && y == other.y;
	}
	
}
