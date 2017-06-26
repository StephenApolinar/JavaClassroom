// Creates a frame containing two buttons.

import java.awt.*;
import javax.swing.*;

public class ComponentsExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300, 100));
		frame.setTitle("A frame");
		
		frame.setLayout(new FlowLayout());
		JButton button1 = new JButton();
		button1.setText("I'm a button.");
		button1.setBackground(Color.BLUE);
		frame.add(button1);
		// attach a listener to handle events on this button
		button1.addActionListener(new MessageListener());

		JButton button2 = new JButton();
		button2.setText("Click me!");
		button2.setBackground(Color.RED);
		frame.add(button2);
		
		frame.pack();
		frame.setVisible(true);
		frame.setVisible(true);
	}
}
