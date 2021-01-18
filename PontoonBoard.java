import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/*
 * This is the main window of the Graphical user Interface 
 */


public class PontoonBoard extends JFrame 

{
	//Components that are in the frame
	Random rand = new Random();
	private JPanel topPanel, bottomPanel;
	private JLabel player;
	private JLabel displayNumber;
	private JLabel gridNumber;
	private JLabel counterLabel;
	private JButton newGameButton;
	private int rows, columns;
	private Grid [][] gridSquares;
	int counter = 0;
	
	
	
	
	public PontoonBoard(int rows, int columns)
	{
		this.rows = rows;
		this.columns = columns;
		this.setSize(600,600); //creates the outer frame
		
		//Creates the top panel
		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		
		
		//Creates the bottom panel
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(rows, columns));
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		bottomPanel.setSize(500,500);
		
		//Components for top panel
		newGameButton = new JButton("New Game");
		//newGameButton.addActionListener(this); //RTD		
		int num = rand.nextInt(2) + 1;
		String players = Integer.toString(num);
		player = new JLabel("Player " + players +"'s turn");
		
		counterLabel = new JLabel("Counter: 0 ");
		
		
		
		
		
		topPanel.add(newGameButton);
		topPanel.add(player);
		topPanel.add(counterLabel);
		
		//Components for bottom panel		
		gridSquares = new Grid[rows][columns];
		for (int x = 0; x < columns; x++)
		{						
			for (int y = 0; y < rows; y++)
			{
				int cons = rand.nextInt(5) + 1;
				String number = Integer.toString(cons);
				gridNumber = new JLabel(number);
				
				gridSquares[x][y] = new Grid(x, y);
				gridSquares[x][y].setSize(20, 20);
				
				bottomPanel.add(gridSquares[x][y]);
				bottomPanel.add(gridNumber);
				
				
				
			}
		}
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(topPanel, BorderLayout.NORTH);
		getContentPane().add(bottomPanel, BorderLayout.CENTER);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}


