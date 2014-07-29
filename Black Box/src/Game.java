import java.util.Random;


public class Game 
{
	private int width, height;
	private int[] ballLoc;
	public Game()
	{
		width = 8;
		height = 8;
		ballLoc = new int[4];
	}
	
	public void setup()
	{
		Random rand = new Random();
		for(int i = 0; i < ballLoc.length; i++)
		{
			ballLoc[i] = rand.nextInt(width * height);
		}
	}
	
	public void guessLocations(int[] guesses)
	{
		for(int i = 0; i < ballLoc.length; i++)
		{
			
		}
	}
}

