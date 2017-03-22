package gui.panels.input;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegExpInputPanel extends JPanel{
	
	JLabel label = new JLabel("Enter Regular Expression: ");
	JTextField textfield = new JTextField(20);
	
	public RegExpInputPanel(){
		super();
		add(label);
		add(textfield);
	}
}
