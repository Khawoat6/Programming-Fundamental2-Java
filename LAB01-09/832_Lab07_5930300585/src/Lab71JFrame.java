// 1.1 Graphical User Interface: GUI
// 1.2 JFrame
// Lab 7.1

import java.awt.Color;
import javax.swing.*;

public class Lab71JFrame 
{
	public static void main(String[] args) 
	{
		
		JFrame frame = new JFrame( "My Frame" );
		frame.setSize( 858, 480 );
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}
}
