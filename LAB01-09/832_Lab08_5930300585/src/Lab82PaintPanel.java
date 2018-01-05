// 1.2 วาดรูปกันเถอะ
// Lab 8.2
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Lab82PaintPanel extends JPanel
{
	private final ArrayList<Point> points = new ArrayList<>();
	
	public Lab82PaintPanel()
	{
		addMouseMotionListener(
			new MouseMotionAdapter()
			{
				@Override
				public void mouseDragged(MouseEvent event)
				{
                       points.add(event.getPoint());
                       repaint();
				}
			}
		);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(Point point : points)
			g.fillOval(point.x, point.y, 4, 4);
	}
}
