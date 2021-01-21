import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


/*
 * This is the main window of the Graphical user Interface
 * 
 *  @Author: Rabbani Alam
 */


public class PontoonBoard extends JFrame implements ActionListener

{
	//Components in the frame
	Random rand = new Random();
	private JPanel topPanel, bottomPanel;
	private JLabel player;
	private JLabel displayInstruction;
	private JLabel counterLabel;
	private JButton newGameButton, button1, button2, button3,button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25;
	private int rows, columns;
	int counter = 0;
	int nums, cons1, cons2, cons3, cons4, cons5, cons6, cons7, cons8, cons9, cons10, cons11, cons12, cons13, cons14, cons15, cons16, cons17, cons18, cons19, cons20, cons21, cons22, cons23, cons24, cons25;
	int value;
	String number;
	
	
	
	/**
	 * Constructor for the class PontoonBoard/
	 * @param rows
	 * @param columns
	 */
	
	
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
			
		
		//Components are added into the top panel
		topPanel.add(displayInstruction);
		topPanel.add(newGameButton);
		topPanel.add(player);
		topPanel.add(counterLabel);
		
		
		//Components for bottom panel				
		cons1 = rand.nextInt(5) + 1;
		button1 = new JButton(Integer.toString(cons1));
		button1.addActionListener(this);
		
		cons2 = rand.nextInt(5) + 1;
		button2 = new JButton(Integer.toString(cons2));
		button2.addActionListener(this);
		
		cons3 = rand.nextInt(5) + 1;
		button3 = new JButton(Integer.toString(cons3));
		button3.addActionListener(this);
		
		cons4 = rand.nextInt(5) + 1;
		button4 = new JButton(Integer.toString(cons4));
		button4.addActionListener(this);
		
		cons5 = rand.nextInt(5) + 1;
		button5 = new JButton(Integer.toString(cons5));
		button5.addActionListener(this);
		
		cons6 = rand.nextInt(5) + 1;
		button6 = new JButton(Integer.toString(cons6));
		button6.addActionListener(this);
		
		cons7 = rand.nextInt(5) + 1;
		button7 = new JButton(Integer.toString(cons7));
		button7.addActionListener(this);
		
		cons8 = rand.nextInt(5) + 1;
		button8 = new JButton(Integer.toString(cons8));
		button8.addActionListener(this);
		
		cons9 = rand.nextInt(5) + 1;
		button9 = new JButton(Integer.toString(cons9));
		button9.addActionListener(this);
		
		cons10 = rand.nextInt(5) + 1;
		button10 = new JButton(Integer.toString(cons10));
		button10.addActionListener(this);
		
		cons11 = rand.nextInt(5) + 1;
		button11 = new JButton(Integer.toString(cons11));
		button11.addActionListener(this);
		
		cons12 = rand.nextInt(5) + 1;
		button12 = new JButton(Integer.toString(cons12));
		button12.addActionListener(this);
		
		cons13 = rand.nextInt(5) + 1;
		button13 = new JButton(Integer.toString(cons13));
		button13.addActionListener(this);
		
		cons14 = rand.nextInt(5) + 1;
		button14 = new JButton(Integer.toString(cons14));
		button14.addActionListener(this);
		
		cons15 = rand.nextInt(5) + 1;
		button15 = new JButton(Integer.toString(cons15));
		button15.addActionListener(this);
		
		cons16 = rand.nextInt(5) + 1;
		button16 = new JButton(Integer.toString(cons16));
		button16.addActionListener(this);
		
		cons17 = rand.nextInt(5) + 1;
		button17 = new JButton(Integer.toString(cons17));
		button17.addActionListener(this);
		
		cons18 = rand.nextInt(5) + 1;
		button18 = new JButton(Integer.toString(cons18));
		button18.addActionListener(this);
		
		cons19 = rand.nextInt(5) + 1;
		button19 = new JButton(Integer.toString(cons19));
		button19.addActionListener(this);
		
		cons20 = rand.nextInt(5) + 1;
		button20 = new JButton(Integer.toString(cons20));
		button20.addActionListener(this);
		
		cons21 = rand.nextInt(5) + 1;
		button21 = new JButton(Integer.toString(cons21));
		button21.addActionListener(this);
		
		cons22 = rand.nextInt(5) + 1;
		button22 = new JButton(Integer.toString(cons22));
		button22.addActionListener(this);
		
		cons23 = rand.nextInt(5) + 1;
		button23 = new JButton(Integer.toString(cons23));
		button23.addActionListener(this);
		
		cons24 = rand.nextInt(5) + 1;
		button24 = new JButton(Integer.toString(cons24));
		button24.addActionListener(this);
		
		cons25 = rand.nextInt(5) + 1;
		button25 = new JButton(Integer.toString(cons25));
		button25.addActionListener(this);

		
		//Components are added into the bottom panel
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
		
		
		//The panels are added into the frame
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(topPanel, BorderLayout.NORTH);
		getContentPane().add(bottomPanel, BorderLayout.CENTER);
				
		
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
			counter += cons1; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button1.setEnabled(false);
				button1.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button1.setBackground(Color.BLUE);
				button1.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button2)) {
			counter += cons2; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button2.setEnabled(false);
				button2.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button2.setBackground(Color.BLUE);
				button2.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		if (selected.equals(button3)) {
			counter += cons3; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			
			if (nums == 1) {
				nums = nums + 1;
				button3.setEnabled(false);
				button3.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button3.setBackground(Color.BLUE);
				button3.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
		
		}
		if (selected.equals(button4)) {
			counter += cons4; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button4.setEnabled(false);
				button4.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button4.setBackground(Color.BLUE);
				button4.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button5)) {
			counter += cons5; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button5.setEnabled(false);
				button5.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button5.setBackground(Color.BLUE);
				button5.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button6)) {
			counter += cons6; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			
			if (nums == 1) {
				nums = nums + 1;
				button6.setEnabled(false);
				button6.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button6.setBackground(Color.BLUE);
				button6.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button7)) {
			counter += cons7; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			
			if (nums == 1) {
				nums = nums + 1;
				button7.setEnabled(false);
				button7.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button7.setBackground(Color.BLUE);
				button7.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			
		}
		
		if (selected.equals(button8)) {
			counter += cons8;
			counterLabel.setText("Counter: " + counter);
			
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
			if (nums == 1) {
				nums = nums + 1;
				button8.setEnabled(false);
				button8.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button8.setBackground(Color.BLUE);
				button8.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			
		}
		if (selected.equals(button9)) {
			counter += cons9; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button9.setEnabled(false);
				button9.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button9.setBackground(Color.BLUE);
				button9.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button10)) {
			counter += cons10; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button10.setEnabled(false);
				button10.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button10.setBackground(Color.BLUE);
				button10.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button11)) {
			counter += cons11; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button11.setEnabled(false);
				button11.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button11.setBackground(Color.BLUE);
				button11.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button12)) {
			counter += cons12; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button12.setEnabled(false);
				button12.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button12.setBackground(Color.BLUE);
				button12.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button13)) {
			counter += cons13; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button13.setEnabled(false);
				button13.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button13.setBackground(Color.BLUE);
				button13.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button14)) {
			counter += cons14; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button14.setEnabled(false);
				button14.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button14.setBackground(Color.BLUE);
				button14.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button15)) {
			counter += cons15; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button15.setEnabled(false);
				button15.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button15.setBackground(Color.BLUE);
				button15.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button16)) {
			counter += cons16; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button16.setEnabled(false);
				button16.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button16.setBackground(Color.BLUE);
				button16.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button17)) {
			counter += cons17; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button17.setEnabled(false);
				button17.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button17.setBackground(Color.BLUE);
				button17.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button18)) {
			counter += cons18; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
		
			if (nums == 1) {
				nums = nums + 1;
				button18.setEnabled(false);
				button18.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button18.setBackground(Color.BLUE);
				button18.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button19)) {
			counter += cons19; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button19.setEnabled(false);
				button19.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button19.setBackground(Color.BLUE);
				button19.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button20)) {
			counter += cons20; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button20.setEnabled(false);
				button20.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button20.setBackground(Color.BLUE);
				button20.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button21)) {
			counter += cons21; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button21.setEnabled(false);
				button21.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button21.setBackground(Color.BLUE);
				button21.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button22)) {
			counter += cons22; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button22.setEnabled(false);
				button22.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			
			else {
				nums = nums - 1;
				button22.setBackground(Color.BLUE);
				button22.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button23)) {
			counter += cons23; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button23.setEnabled(false);
				button23.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button23.setBackground(Color.BLUE);
				button23.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		
		if (selected.equals(button24)) {
			counter += cons24; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			if (nums == 1) {
				nums = nums + 1;
				button24.setEnabled(false);
				button24.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button24.setBackground(Color.BLUE);
				button24.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
			
		}
		if (selected.equals(button25)) {
			counter += cons25; //Counter increases by the number on the tile
			counterLabel.setText("Counter: " + counter);
			
			
			
			if (nums == 1) {
				nums = nums + 1;
				button25.setEnabled(false);
				button25.setBackground(Color.YELLOW);
				player.setText("Player" + nums + "'s turn");
			}
			else {
				nums = nums - 1;
				button25.setBackground(Color.BLUE);
				button25.setEnabled(false);
				player.setText("Player" + nums + "'s turn");
			}
			if (counter >= 22) {
				displayInstruction.setText("Congratulations player"+ nums +" won!");				
				player.setText("");
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button10.setEnabled(false);
				button11.setEnabled(false);
				button12.setEnabled(false);
				button13.setEnabled(false);
				button14.setEnabled(false);
				button15.setEnabled(false);
				button16.setEnabled(false);
				button17.setEnabled(false);
				button18.setEnabled(false);
				button19.setEnabled(false);
				button20.setEnabled(false);
				button21.setEnabled(false);
				button22.setEnabled(false);
				button23.setEnabled(false);
				button24.setEnabled(false);
				button25.setEnabled(false);				
			}
		
			
		}
		
//		System.out.println(number);
//		counter = counter + value;
//		counterLabel.setText("Counter: " + counter);
//		disp.setEnabled(false);
//		disp.setBackground(Color.YELLOW);
		
		
	}
	
	
}


