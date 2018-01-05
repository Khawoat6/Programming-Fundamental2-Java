// 1.2 วาดรูปกันเถอะ
// Lab 8.2

import javax.swing.*;
import javax.swing.JFrame;

public class Lab81DrawSmileyTest 
{
	public static void main(String[] args) 
	{
		Lab81DrawSmiley panel = new Lab81DrawSmiley();
		
		JFrame applicatioln = new JFrame();
		
		applicatioln.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicatioln.add(panel);
		applicatioln.setSize(250,  250);
		applicatioln.setVisible(true);
		
	}

}
