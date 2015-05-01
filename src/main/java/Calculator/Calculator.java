package Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame {
	public static void main(String args[]) {
		JFrame frame = new Calculator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.setSize(300, 200);
		frame.setContentPane(new CalculatorView());
		frame.setVisible(true);
	}
}

class CalculatorView extends JPanel {
	private JTextField view;
	private JPanel panelNorth, panelSouth;
	private JButton button1;

	public CalculatorView() {
		setLayout(new BorderLayout());

		// Panels
		panelNorth = new JPanel();
		panelSouth = new JPanel();

		// Add panel to layout
		panelNorth.setLayout(new FlowLayout());
		panelSouth.setLayout(new GridLayout(4, 4));

		// Fill panels with components

		// Northpanel
		view = new JTextField(200);
		view.addActionListener(new InputHandler());

		panelNorth.add(view);

		// Southpanel
		button1 = new JButton("7");
		panelSouth.add(button1);

		// Shortlink
		panelSouth.add(new JButton("8"));
		panelSouth.add(new JButton("9"));
		panelSouth.add(new JButton("+"));
		panelSouth.add(new JButton("4"));
		panelSouth.add(new JButton("5"));
		panelSouth.add(new JButton("6"));
		panelSouth.add(new JButton("-"));
		panelSouth.add(new JButton("1"));
		panelSouth.add(new JButton("2"));
		panelSouth.add(new JButton("3"));
		panelSouth.add(new JButton("*"));
		panelSouth.add(new JButton("0"));
		panelSouth.add(new JButton("/"));
		panelSouth.add(new JButton("C"));
		panelSouth.add(new JButton("="));

		add(panelNorth, BorderLayout.NORTH);
		add(panelSouth, BorderLayout.SOUTH);
	}

	// inside class
	class InputHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()  == button1 ) {
				
			}
		}
	}
}
