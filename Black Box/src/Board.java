
public class Board 
{
	int width, height;
	Location[] ballLocations;
	
	public Board(int w, int h)
	{
		this(w, h, 4);
	}
	
	public Board(int w, int h, int ballCount)
	{
		width = w;
		height = h;
		ballLocations = new Location[4];
	}
	
	public boolean addBall(int x, int y)
	{
		for(int i = 0; i < ballLocations.length; i++)
		{
			if(ballLocations[i] == null)
			{
				ballLocations[i] = new Location(x, y);
				for(int j = 0; j < i; j++)
				{
					if(ballLocations[i].equals(ballLocations[j]))
					{
						ballLocations[i] = null;
						return false;
					}
				}
				
				return true;
			}
		}
		return false;
	}
	
	public int getNumBalls()
	{
		return ballLocations.length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public Location[] getLocations()
	{
		return ballLocations;
	}
	}
}
