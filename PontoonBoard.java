import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/*
 * This is the main window of the Graphical user Interface 
 */


public class PontoonBoard extends JFrame implements ActionListener

{
	//Components that are in the frame
	Random rand = new Random();
	private JPanel topPanel, bottomPanel;
	private JLabel player;
	private JLabel displayInstruction;
	//private JLabel gridNumber;
	private JLabel counterLabel;
	private JButton newGameButton, button1, button2, button3,button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25;
	private JButton disp;
	private int rows, columns;
	private Grid [][] gridSquares;
	int counter = 0;
	int nums;
	int value;
	String number;
	
	
	
	
	public PontoonBoard(int rows, int columns)
	{
		this.rows = rows;
		this.columns = columns;
		this.setSize(600, 600); //creates the outer frame
		
		//Creates the top panel
		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		
		
		
		//Creates the bottom panel
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(rows, columns, 4, 4));		
		
		
		//Components for top panel
		newGameButton = new JButton("New Game");
		newGameButton.addActionListener(this); 	
		
		displayInstruction = new JLabel("Keep the total below 22. Click New Game to begin.");
		
		nums = rand.nextInt(2) + 1;
		String players = Integer.toString(nums);
		player = new JLabel("Player " + players +"'s turn");
		
		counterLabel = new JLabel("Counter: 0 ");
						
		topPanel.add(displayInstruction);
		topPanel.add(newGameButton);
		topPanel.add(player);
		topPanel.add(counterLabel);
		
		
		//Components for bottom panel		
		
		gridSquares = new Grid[rows][columns];
		
		int cons = rand.nextInt(5) + 1;
		
		button1 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button1.addActionListener(this);
		
		button2 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button2.addActionListener(this);
		
		button3 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button3.addActionListener(this);
		
		button4 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button4.addActionListener(this);
		
		button5 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button5.addActionListener(this);
		
		button6 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button6.addActionListener(this);
		
		button7 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button7.addActionListener(this);
		
		button8 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button8.addActionListener(this);
		
		button9 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button9.addActionListener(this);
		
		button10 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button10.addActionListener(this);
		
		button11 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button11.addActionListener(this);
		
		button12 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button12.addActionListener(this);
		
		button13 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button13.addActionListener(this);
		
		button14 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button14.addActionListener(this);
		
		button15 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button15.addActionListener(this);
		
		button16 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button16.addActionListener(this);
		
		button17 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button17.addActionListener(this);
		
		button18 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button18.addActionListener(this);
		
		button19 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button19.addActionListener(this);
		
		button20 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button20.addActionListener(this);
		
		button21 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button21.addActionListener(this);
		
		button22 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button22.addActionListener(this);
		
		button23 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button23.addActionListener(this);
		
		button24 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button24.addActionListener(this);
		
		button25 = new JButton(Integer.toString(rand.nextInt(5)+1));
		button25.addActionListener(this);
		
		bottomPanel.add(button1);
		bottomPanel.add(button2);
		bottomPanel.add(button3);
		bottomPanel.add(button4);
		bottomPanel.add(button5);
		bottomPanel.add(button6);
		bottomPanel.add(button7);
		bottomPanel.add(button8);
		bottomPanel.add(button9);
		bottomPanel.add(button10);
		bottomPanel.add(button11);
		bottomPanel.add(button12);
		bottomPanel.add(button13);
		bottomPanel.add(button14);
		bottomPanel.add(button15);
		bottomPanel.add(button16);
		bottomPanel.add(button17);
		bottomPanel.add(button18);
		bottomPanel.add(button19);
		bottomPanel.add(button20);
		bottomPanel.add(button21);
		bottomPanel.add(button22);
		bottomPanel.add(button23);
		bottomPanel.add(button24);
		bottomPanel.add(button25);
		
		
//		for (int x = 0; x < columns; x++)
//		{						
//			for (int y = 0; y < rows; y++)
//			{	
//				
//				gridSquares[x][y] = new Grid(x, y);
//				gridSquares[x][y].setSize(500, 500);															
//
//				value = gridSquares[x][y].gridButton();
//				number = Integer.toString(value);
//				disp = new JButton(number);
//				disp.addActionListener(this);
//				disp.setFont(disp.getFont().deriveFont(32f));								
//												
//				bottomPanel.add(disp);																
//				
//			}
//		}
		
		
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(topPanel, BorderLayout.NORTH);
		getContentPane().add(bottomPanel, BorderLayout.CENTER);
		pack();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
	}
	
	/* 
	 * Action listener methods
	 */
	public void actionPerformed(ActionEvent aevt)
	{	
		Object selected = aevt.getSource();
		if (selected.equals(newGameButton)) {
			setVisible(false);
			getContentPane().remove(topPanel);
			getContentPane().remove(bottomPanel);
			PontoonBoard board = new PontoonBoard(rows,columns);
		}		 
		
		
		if (selected.equals(button1)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button2)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button3)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button4)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button5)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button6)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button7)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button8)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button9)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button10)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button11)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button12)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button13)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button14)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button15)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button16)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button17)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button18)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button19)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button20)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button21)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button22)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button23)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button24)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		if (selected.equals(button25)) {
			if (nums == 1) {
				button1.setEnabled(false);
				button1.setBackground(Color.GREEN);
				player.setText("Player 2's turn");
			}
			else {
				button1.setBackground(Color.RED);
				button1.setEnabled(false);
				player.setText("Player 1's turn");
			}
			
		}
		
//		System.out.println(number);
//		counter = counter + value;
//		counterLabel.setText("Counter: " + counter);
//		disp.setEnabled(false);
//		disp.setBackground(Color.YELLOW);
		
		
	}
	
	
}


