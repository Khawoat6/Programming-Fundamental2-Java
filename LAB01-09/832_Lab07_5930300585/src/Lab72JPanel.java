// 1.3 JPanel
// Lab 7.2

import java.awt.Color;
import javax.swing.*;

public class Lab72JPanel 
{
	public static void main (String[] args)
	{
		JFrame frame = new JFrame( "My Frame" );
		frame.setSize( 480, 360 );
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}

}
