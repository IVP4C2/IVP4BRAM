package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Caret;

public class Calculator2 extends JFrame {
	public static void main(String args[]) {
		JFrame frame = new Calculator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.setSize(300, 200);
		frame.setContentPane(new CalculatorView2());
		frame.setVisible(true);

	}
}

class CalculatorView2 extends JPanel {

	// Attributes
	private JTextField view;
	private JPanel keyboard;
	private final int AMOUNT_OF_BUTTONS = 16;
	private JButton[] button;

	// Constructor

	public CalculatorView2() {
		setLayout(new BorderLayout());

		// Give a special font to the view output
		Font font = new Font("SansSerif", Font.PLAIN, 12);

		// Making the menu items including the ActionListeners
		view = new JTextField();
		view.setFont(font);
		add(view, BorderLayout.NORTH);
		view.setBackground(Color.YELLOW);

		keyboard = new JPanel();
		keyboard.setLayout(new GridLayout(4, 4));
		keyboard.setFont(font);
		add(keyboard);

		button = new JButton[AMOUNT_OF_BUTTONS];
		for (int i = 0; i <= 9; i++) {
			button[i] = new JButton("" + i);
		}

		button[10] = new JButton("+");
		button[11] = new JButton("-");
		button[12] = new JButton("*");
		button[13] = new JButton("/");
		button[14] = new JButton("C");
		button[15] = new JButton("=");


		// Add buttons to keyboard

		// First row
		for (int i = 7; i <= 10; i++) {
			keyboard.add(button[i]);
		}

		// Second row
		for (int i = 4; i <= 6; i++) {
			keyboard.add(button[i]);
		}
		// add button 11 with -
		keyboard.add(button[11]);

		// Third row
		for (int i = 1; i <= 3; i++) {
			keyboard.add(button[i]);
		}
		// add button 12 with *
		keyboard.add(button[12]);

		// Bottom row
		keyboard.add(button[0]);
		for (int i = 13; i <= 15; i++) {
			keyboard.add(button[i]);
		}

		 button[i].addActionListener();

		// inside class
		class CalculatorHandler implements ActionListener {
			public void actionPerformed(ActionEvent click) {
//				for (int i = 0; i <= button.length; i++) {
//					if (click.getSource() == button[i]) {
//						view.setText("" + button[i].getText());
//					}
					// view.setText("ertyretyS" + button[i]);
					if (((JButton) click.getSource()).getText() == "+") {
						view.setText("+");

					}
				}
			}
		}
	}
}
