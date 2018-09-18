// This is a very simple Swing program

import javax.swing.*;

public class SwingDemo
{
	SwingDemo() 
	{
		// Creates a new JFrame container.
		JFrame jFrm = new JFrame("A Simple Swing Program");

		// Gives the frame an initial size.
		jFrm.setSize(275, 100);

		// Terminates the program when the user closes the application.
		jFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creates a text-based label.
		JLabel jLab = new JLabel("Swing powers the modern Java GUI.");

		// Adds the label to the content pane.
		jFrm.add(jlab);

		// Displays the frame.
		jFrm.setVisible(true);
	}

	public static void main(String[] args)
	{
		// Creates the fram on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}
}
