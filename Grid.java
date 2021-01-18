import java.awt.Color;
import javax.swing.*;
import java.util.Random;




public class Grid extends JPanel
{
	private int xcoord, ycoord;
	private JLabel displayNumber;
	Random rand = new Random();
	
	public Grid(int xcoord, int ycoord)
	{
		super();
		this.setSize(50, 50);
		this.xcoord = xcoord;
		this.ycoord = ycoord;
	}
	
	public void setColor( int decider)
    {
		
        Color colour = (int) (decider/2.0) == (decider/2.0) ? Color.blue : Color.yellow;
        this.setBackground( colour);
    }
	
//	public void setGridNumber()
//	{
//		int cons = rand.nextInt(5) + 1;
//		String number = Integer.toString(cons);
//		this.displayNumber = new JLabel(number);
//		
//	}

}
