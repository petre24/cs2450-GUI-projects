// This is a simple stopwatch program.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Stopwatch implements ActionListener {
	private JLabel jlab;
	private long start;  // holds the start time in milliseconds

	public Stopwatch() {
		// Creates a new JFrame container.
		JFram jfrm = new jfrm("A Simple Stopwatch");

		// Specifies FlowLayout (not the default) for the layout manager.
		jfrm.setlayout(new FlowLayout());

		// Gives the frame an initial size.
		jfrm.setSize(240, 100);

		// Terminates the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Makes two buttons.
		JButton jbtnStart = new JButton("Start");
		JButton jbtnStop = new JButton("Stop");

		// Adds action listeners.
		jbtnStart.addActionListener(this);
		jbtnStop.addActionListener(this);

		// Adds the buttons to the content pane.
		jfrm.add(jbtnStart);
		jfrm.add(jbtnStop);

		// Creates a text-based label.
		jlab = new JLabel("Press Start to begin timing.");

		// Adds the label to the frame.
		jfrm.add(jlab);

		// Displays the frame.
		jfrm.setVisible(true);
	} 

	// Handles the button events.
	public void actionPerformed(ActionEvent ae) {
		// Calender cal = Calendar.getInstance();  // this gets the current system time
		
		if (ae.getActionCommand().equals("Start"))
		{
			// Store the start time.
			start = ae.getWhen();  // cal.getTimeInMillis();
			jlab.setText("Stopwatch is running...");
		}
		else  // Computes the elapsed time
		{
			jlab.setText("Elapsed time is "
				     + (double)(ae.getWhen() /*cal.getTimeInMillis()*/ - start) / 1000);
		}
	}

	public static void main(String[] args) {
		// Creates the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Stopwatch();
			}
		});
	}
}

