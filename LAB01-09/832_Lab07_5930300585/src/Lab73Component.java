// 1.4 Component(Button + Label)
// Lab 7.3

import java.awt.*;
import javax.swing.*;

public class Lab73Component 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame( "My Frame" );
		frame.setSize(858, 858);
		JPanel panel = new JPanel();				// Create Panel
		panel.setBackground(Color.BLACK);			// Set Color BG
		
		Icon icon1 = new ImageIcon("Image/01_Button.png");
		Icon icon2 = new ImageIcon("Image/02_Animation 5.21.30 PM.gif");
		
		JButton btn1 = new JButton("Button", icon1);
		JLabel label1 = new JLabel("Click here", SwingConstants.RIGHT);
		JLabel label2 = new JLabel("Animation", icon2 , SwingConstants.LEFT);
		
		label1.setForeground(Color.WHITE);
		label2.setForeground(Color.WHITE);
		
		panel.add(btn1);							// add component1 btn1
		panel.add(label1);							// add component2 label1
		panel.add(label2);							// add component3 label2
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}

}
