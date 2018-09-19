
// listing 2
// Demonstrate a button. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {

    private JLabel jlab;

    ButtonDemo() {

        // Create a new JFrame container. 
        JFrame jfrm = new JFrame("A Button Example");

        // Specify FlowLayout for the layout manager. 
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size. 
        jfrm.setSize(220, 90);

        // Terminate the program when the user closes the application. 
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make two buttons. 
        JButton jbtnFirst = new JButton("First");
        JButton jbtnSecond = new JButton("Second");

        // Add action listeners. 
        jbtnFirst.addActionListener(this);
        jbtnSecond.addActionListener(this);

        // Add the buttons to the content pane. 
        jfrm.add(jbtnFirst);
        jfrm.add(jbtnSecond);
        
        //jbtnFirst.setText("Third");

        // Create a text-based label. 
        jlab = new JLabel("Press a button.");

        // Add the label to the frame. 
        jfrm.add(jlab);

        // Display the frame. 
        jfrm.setVisible(true);
    }

    // Handle button events. 
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("First")) {
            jlab.setText("First button was pressed.");
        } else {
            jlab.setText("Second button was pressed. ");
        }
    }

    public static void main(String args[]) {

        // Create the frame on the event dispatching thread. 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });

    }
}
