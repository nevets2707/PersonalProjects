import java.util.Arrays;
import java.util.Random;


public class Game 
{
	private Board board;
	public Game()
	{
		board = new Board(8, 8);
	}
	
	public void setup()
	{
		Random rand = new Random();
		for(int i = 0; i < board.getNumBalls(); i++)
		{
			while(!board.addBall(rand.nextInt(board.getWidth()), rand.nextInt(board.getHeight())));
		}
	}
	
	public boolean guessLocations(Location[] guesses)
	{
		if(guesses.length != board.getNumBalls())
			return false;
		
		return Arrays.deepEquals(board.getLocations(), guesses); //TODO: TEST THIS
	}
}

