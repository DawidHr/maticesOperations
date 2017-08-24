package maticesOperations;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel {
	
	JLabel label = new JLabel("Proszê wybraæ operacje jaka zostanie wykonana");
	JFrame frame;
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	MainPanel() {
		super();
	}

	MainPanel(JFrame frame) {
		super();
		this.frame = frame;
		main();
	}

	private void main() {
		frame.setSize(350, 180);
		
		setPanel1();
		setPanel2();
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
	}

	private void setPanel1() {
		panel1.add(label, BorderLayout.CENTER);
	}

	private void setPanel2() {
		JButton operation1 = new JButton("Dodawanie");
		JButton operation2 = new JButton("Odejmowanie");
		JButton operation3 = new JButton("Mno¿enie");

		operation1.addActionListener(listener);
		operation2.addActionListener(listener);
		operation3.addActionListener(listener);

		panel2.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 100;
		c.weighty = 100;
		c.fill = GridBagConstraints.BOTH;
		panel2.add(operation1, c);
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 100;
		c.weighty = 100;
		panel2.add(operation2, c);
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 100;
		c.weighty = 100;
		panel2.add(operation3, c);
	}

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getActionCommand());
			if (e.getActionCommand().equalsIgnoreCase("Dodawanie")) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				operation1_2 start = new operation1_2(frame, 1);
			} else if (e.getActionCommand().equalsIgnoreCase("Odejmowanie")) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				operation1_2 start = new operation1_2(frame, 2);
			} else if (e.getActionCommand().equalsIgnoreCase("Mno¿enie")) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				System.out.println("hej");
				operation3 start = new operation3(frame);
			} else {
				System.out.println("Brak wybranej opcji");
			}
		}
	};

}
