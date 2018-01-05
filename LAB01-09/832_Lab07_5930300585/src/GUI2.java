import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI2 extends JFrame
{
	private JTextField textField1 , textField2 ;
	private JCheckBox check1, check2 ;

	
	public GUI2()
	{
		super( " Account " );
		Container c = getContentPane() ;
		c.setLayout( new FlowLayout() ) ;
		Font font1 = new Font( "Courier New", Font.BOLD, 20 ) ;
		
	// Create Panel
		JPanel panel = new JPanel();
		
	// label and text entry field
		JLabel label1 = new JLabel();
		label1.setFont(font1);
		
	// Create textField1
		textField1 = new JTextField(35);   		// 35 chars wide
		textField1.setFont(font1);
		
	// Create textField2
		textField2 = new JTextField(35);   		// 35 chars wide
		textField2.setFont(font1);
		
	// Create CheckBox
		JCheckBox check1 = new JCheckBox( "Swap" );
		JCheckBox check2 = new JCheckBox( "Modify on Swap" );
		
	// Create Button1
		JButton btn1 = new JButton( "Clear" );
		btn1.setFont(font1);
		btn1.setPreferredSize( new Dimension( 100, 40 ));
		
		btn1.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				textField1.setText("") ;
				textField2.setText("") ;
				label1.setText("") ;
			}
		});
        
	// Create Button2
		JButton btn2 = new JButton( "Submit" );
		btn2.setFont(font1);
		btn2.setPreferredSize(new Dimension(100, 40));
		
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				label1.setText(textField1.getText() + textField2.getText());
			}
			
		});
		
		btn2.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				if( check1.isSelected())
				{
					label1.setText(textField2.getText() + textField1.getText());
					c.add(label1);
				}
				if( check2.isSelected() && check1.isSelected())
				{
					String input1 = textField1.getText() ;
					String input2 = textField2.getText() ;
					textField1.setText(input2) ;
					textField2.setText(input1) ;
					label1.setText(textField2.getText() + textField1.getText()) ;
					c.add(label1);
				}	
			}
		} );
		
	// add to Container
		c.add(label1);
		c.add(textField1);
		c.add(textField2);
		c.add(check1);
		c.add(check2);
		c.add(btn2);
		c.add(btn1);
	
	// set Jframe
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(480,360);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new GUI2();
	}

}
