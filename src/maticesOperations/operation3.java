package maticesOperations;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class operation3 {
	JFrame frame;
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JButton buttons[] = new JButton[9];
	JLabel text = new JLabel("Proszê wybraæ wielkoœc macierzy");

	operation3(JFrame frame) {
		this.frame = frame;
		main();
	}

	public void main() {
		setButtons();
		setPanel1();
		setPanel2();
		panel.add(panel1, BorderLayout.NORTH);
		panel.add(panel2, BorderLayout.CENTER);
		frame.add(panel);
	}

	private void setButtons() {
		buttons[0] = new JButton(" 2x3 ");
		buttons[1] = new JButton(" 2x4 ");
		buttons[2] = new JButton(" 2x5 ");
		buttons[3] = new JButton(" 2x6 ");
		buttons[4] = new JButton(" 3x4 ");
		buttons[5] = new JButton(" 3x5 ");
		buttons[6] = new JButton(" 3x6 ");
		buttons[7] = new JButton(" 4x5 ");
		buttons[8] = new JButton(" 4x6 ");
		for (int i = 0; i < 9; i++) {
			buttons[i].addActionListener(listener);
			;
		}

	}

	private void setPanel1() {
		panel1.add(text);
	}

	private void setPanel2() {
		panel2.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 10;
		c.weighty = 10;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		panel2.add(buttons[0], c);
		c.gridx = 1;
		c.gridy = 0;
		panel2.add(buttons[1], c);
		c.gridx = 2;
		c.gridy = 0;
		panel2.add(buttons[2], c);
		c.gridx = 0;
		c.gridy = 1;
		panel2.add(buttons[3], c);
		c.gridx = 1;
		c.gridy = 1;
		panel2.add(buttons[4], c);
		c.gridx = 2;
		c.gridy = 1;
		panel2.add(buttons[5], c);
		c.gridx = 0;
		c.gridy = 2;
		panel2.add(buttons[6], c);
		c.gridx = 1;
		c.gridy = 2;
		panel2.add(buttons[7], c);
		c.gridx = 2;
		c.gridy = 2;
		panel2.add(buttons[8], c);

	}

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			panel.setVisible(false);
			String i = e.getActionCommand();
			int c;
			int v;
			if (i.equalsIgnoreCase(" 2x3 ")) {
				c = 1;
				v = 2;
			} else if (i.equalsIgnoreCase(" 2x4 ")) {
				c = 1;
				v = 3;
			} else if (i.equalsIgnoreCase(" 2x5 ")) {
				c = 1;
				v = 4;
			} else if (i.equalsIgnoreCase(" 2x6 ")) {
				c = 1;
				v = 5;
			} else if (i.equalsIgnoreCase(" 3x4 ")) {
				c = 2;
				v = 3;
			} else if (i.equalsIgnoreCase(" 3x5 ")) {
				c = 2;
				v = 4;
			} else if (i.equalsIgnoreCase(" 3x6 ")) {
				c = 2;
				v = 5;
			} else if (i.equalsIgnoreCase(" 4x5 ")) {
				c = 3;
				v = 4;
			} else {
				c = 3;
				v = 5;
			}

			matices2 start = new matices2(frame, c, v);
		}
	};
}
