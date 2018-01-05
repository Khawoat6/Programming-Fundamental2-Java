import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame
{
	private JTextField textField1 ;
	
	public GUI()
	{
		
		super( " Account " );
		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		Font font1 = new Font( "Courier New" , Font.BOLD, 20 );
		
	// label and text entry field
		JLabel label1 = new JLabel( " Account login " );
		label1.setFont(font1);
		
		textField1 = new JTextField(35);   	// 35 chars wide
		textField1.setFont(font1);
		
	// Create Button
		JButton btn1 = new JButton( "Clear" );
		btn1.setFont(font1);
		btn1.setPreferredSize(new Dimension(200, 30));
		
		btn1.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				textField1.setText( "" );
			}
		});
		
		c.add(label1);
		c.add(textField1);
		c.add(btn1);

		
	// Handle events from pressing return
		textField1.addActionListener( new ActionListener()
		  {
			public void actionPerformed( ActionEvent e )
			{
				System.out.println( e.getActionCommand() );
				textField1.setText( " " );	
			}
		  } );
		
		setBackground(Color.black);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(480,360);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new GUI();
	}
}
