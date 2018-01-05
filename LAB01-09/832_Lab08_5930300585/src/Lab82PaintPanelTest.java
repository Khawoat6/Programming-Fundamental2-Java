import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.*;

public class Lab82PaintPanelTest 
{
	public static void main(String[] args) 
	{
		Lab82PaintPanel panel = new Lab82PaintPanel();
		
		//PaintPanel paintPanel = PaintPanel();
		JFrame application = new JFrame("Paint Applications");
		
		Lab82PaintPanel paintPanel = new Lab82PaintPanel();
		application.add(paintPanel);
		application.add(new JLabel("Drag the mouse to draw"), SwingConstants.CENTER);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(480, 360);
		application.setVisible(true);
	}
	
}
