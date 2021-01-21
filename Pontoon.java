/*
 * The Game of Pontoon
 * 
 * This is the main class for the game. It calls the board with a fixed rows and columns.
 * 
 * @Author: Rabbani Alam
 */
public class Pontoon 
{	
	public static void main(String[] args)
	{
		// create a new GUI window
		//WindowDemo demo = new WindowDemo(10, 10);
		PontoonBoard demo = new PontoonBoard(5, 5);
	}
}
