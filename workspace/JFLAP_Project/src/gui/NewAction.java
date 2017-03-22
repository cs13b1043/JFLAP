package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

import constants.StringConstants;
import gui.frames.FrameFactory;

public class NewAction extends AbstractAction {

	public NewAction() {
		super();
	}

	/** Shows Menu */
	public static void showNew() {
		if (DIALOG == null)
			DIALOG = new NewDialog();
		DIALOG.setVisible(true);
		DIALOG.toFront();
	}

	/** The dialog box that allows one to create new environments. */
	protected static class NewDialog extends JFrame {

		public NewDialog() {
			super("JFLAP");
			getContentPane().setLayout(new GridLayout(0, 1));
			initComponents();
			setResizable(false);
			this.pack();
			this.setLocation(50, 50);
		}

		private void initComponents() {
			JButton button = null;

			button = new JButton(StringConstants.FSA);
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Creating Finite automaton window");
					FrameFactory.createFrame(StringConstants.FSA);
				}
			});
			getContentPane().add(button);

			button = new JButton(StringConstants.RETONFA);
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Creating RE to NFA window");
					FrameFactory.createFrame(StringConstants.RETONFA);
				}
			});
			getContentPane().add(button);

			button = new JButton(StringConstants.NFATODFA);
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Creating NFA to DFA window");
					FrameFactory.createFrame(StringConstants.NFATODFA);
				}
			});
			getContentPane().add(button);

			button = new JButton(StringConstants.DFATORE);
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Creating DFA to RE window");
					FrameFactory.createFrame(StringConstants.DFATORE);
				}
			});
			getContentPane().add(button);
		}
	}

	/** The universal dialog. */
	protected static NewDialog DIALOG = null;

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
