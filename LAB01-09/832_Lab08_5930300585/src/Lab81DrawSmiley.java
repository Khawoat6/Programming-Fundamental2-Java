// 1.1 Mr.Smile
// Lab 8.1

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Lab81DrawSmiley extends JPanel
{
	public void paintComponent( Graphics g)
	{
		super.paintComponent(g);
		
		//draw face
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		//draw eye
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		//draw mouth
		g.fillOval(50, 110, 120 , 60);
		
		//draw smile
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	}
}
