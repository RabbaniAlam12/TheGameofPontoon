import java.awt.Color;
import javax.swing.*;
import java.util.Random;




public class Grid extends JPanel 
{
	private int xcoord, ycoord;
	private JLabel displayNumber;
	//private JButton disp;
	Random rand = new Random();
	
	public Grid(int xcoord, int ycoord)
	{
		super();
		this.setSize(500, 500);
		this.xcoord = xcoord;
		this.ycoord = ycoord;
	}
	
	public void setColor( int decider)
    {
		
        Color colour = (int) (decider/2.0) == (decider/2.0) ? Color.blue : Color.yellow;
        this.setBackground( colour);
    }
	
	public void gridButton()
	{
		int cons = rand.nextInt(5) + 1;
		String num = Integer.toString(cons);
		
		JButton button1 = new JButton("num");
		JButton button2 = new JButton("num");
		JButton button3 = new JButton("num");
		JButton button4 = new JButton("num");
		JButton button5 = new JButton("num");
		JButton button6 = new JButton("num");
		JButton button7 = new JButton("num");
		JButton button8 = new JButton("num");
		JButton button9 = new JButton("num");
		JButton button10 = new JButton("num");
		JButton button11 = new JButton("num");
		JButton button12 = new JButton("num");
		JButton button13 = new JButton("num");
		JButton button14 = new JButton("num");
		JButton button15 = new JButton("num");
		JButton button16 = new JButton("num");
		JButton button17 = new JButton("num");
		JButton button18 = new JButton("num");
		JButton button19 = new JButton("num");
		JButton button20 = new JButton("num");
		JButton button21 = new JButton("num");
		JButton button22 = new JButton("num");
		JButton button23 = new JButton("num");
		JButton button24 = new JButton("num");
		JButton button25 = new JButton("num");
		
		
		//disp = new JButton(number);
	}
	
//	public void setGridNumber()
//	{
//		int cons = rand.nextInt(5) + 1;
//		String number = Integer.toString(cons);
//		this.displayNumber = new JLabel(number);
//		
//	}

}
