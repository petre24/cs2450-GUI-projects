//
//	Name:    	 Quintua, Petre
//	Project: 	 1
//	Due:	 	 September 19, 2018
//	Course:  	 CS-2450-01-F18
//
//	Description: This is a simple temperature converted class that will convert
//					temperature from Fahrenheit to Celsius using Java Swing.
//

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTemperature extends Exception implements ActionListener 
{
	private JTextField jtf;
	private JLabel celsius;
	
	public JTemperature() 
	{
		// Creates a new JFrame container.
		JFrame jfrm = new JFrame("Temperature Converter");
		
		// Specifies BorderLayout for the layout manager.
		jfrm.setLayout(new BorderLayout());
		
		// Gives the frame an initial size.
		jfrm.setSize(240, 120);
		
		// Terminates the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creates all the labels necessary for the frame.
		//	These labels are then added to its correct position in the frame.
		JLabel name, enter, fahrenheit;
		
		name = new JLabel("(c) P. Quintua");
		enter = new JLabel("Enter:");
		fahrenheit = new JLabel("degrees F");
		celsius = new JLabel("degrees C");
		
		jfrm.add(name, BorderLayout.NORTH);
		  name.setHorizontalAlignment(JLabel.CENTER);
		jfrm.add(enter, BorderLayout.WEST);
		jfrm.add(fahrenheit, BorderLayout.EAST);
		jfrm.add(celsius,  BorderLayout.SOUTH);
		  celsius.setHorizontalAlignment(JLabel.RIGHT);
		
		// Creates a text field instance.
		jtf = new JTextField(10);
		jtf.setActionCommand("Input");
		
		// Adds an action listener for the text field.
		jtf.addActionListener(this);
		
		// Adds the text field to the frame.
		jfrm.add(jtf);
		
		// Displays the frame.
		jfrm.setVisible(true);
	}  // end temperature converter class
	
	// Handles action events.
	public void actionPerformed(ActionEvent ae)
	{
		double input, result;
		
		boolean parsable = isParsable(jtf.getText());
		
		System.out.println(ae.getActionCommand());
		
		if (parsable) {
			// Obtains the current input and converts it to celsius
			input = Double.parseDouble(jtf.getText());
			result = Math.round((((input - 32) * 5) / 9) * 100.0) / 100.0;
			celsius.setText("= " + result + " degrees C");
		}
		else
			celsius.setText("Invalid input");
	}  // end actionPerformed
	
	// Checks if the text field's contents is parsable.
	public static boolean isParsable(String text)
	{
		boolean parsable = true;
		try {
			Double.parseDouble(text);
		}
		catch(Exception e) {
			parsable = false;
		}
		return parsable;
	}  // end isParsable
	
	public static void main(String args[])
	{
		// Creates the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JTemperature();
			}
		});
	}  // end main
}  // end JTemperature

