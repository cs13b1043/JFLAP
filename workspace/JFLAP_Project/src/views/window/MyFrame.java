package gui.frames;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import constants.StringConstants;
import gui.panels.input.AutomatonInputPanel;
import gui.panels.input.RegExpInputPanel;

public class MyFrame extends JFrame {
	private JPanel input, output, steps;

	public MyFrame(String title) {
		super(title);
		this.setSize(1000, 600);
		this.setLayout(new GridLayout(0, 3));

		if (title == StringConstants.RETONFA) {
			input = new RegExpInputPanel();
		} else if (title == StringConstants.DFATORE || title == StringConstants.NFATODFA) {
			input = new AutomatonInputPanel();
		} else {
			input = new JPanel(new FlowLayout());
			input.setBackground(Color.BLUE);
		}

		output = new JPanel(new FlowLayout());
		output.setBackground(Color.green);

		steps = new JPanel(new FlowLayout());
		steps.setBackground(Color.RED);

		getContentPane().add(input);
		getContentPane().add(output);
		getContentPane().add(steps);
	}
}
