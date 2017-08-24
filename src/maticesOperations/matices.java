package maticesOperations;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class matices {
	JFrame frame;
	int option;
	int option2;
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JLabel text = new JLabel("Proszê wype³niæ macierz");
	JButton save = new JButton("Zapisz");
	ArrayList<JTextField> list = new ArrayList<>();
	ArrayList<JTextField> list2 = new ArrayList<>();
	boolean end = false;

	matices(JFrame frame, int option, int option2) {
		this.frame = frame;
		this.option = option;
		this.option2 = option2;
		main();
	}

	matices(JFrame frame, int option, int option2, ArrayList<JTextField> list) {
		this.frame = frame;
		this.option = option;
		this.option2 = option2;
		list2.addAll(list);
		end = true;
		list.removeAll(list);
		main();
	}

	private void main() {

		setPanel1();
		setPanel2();
		setPanel3();
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.add(panel3, BorderLayout.SOUTH);
		frame.pack();
	}

	private void setPanel1() {
		panel1.add(text);
	}

	private void setPanel2() {
		setOperation();
	}

	private void setPanel3() {
		panel3.add(save);
		save.addActionListener(listener);
	}

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (end == false) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				matices start = new matices(frame, option, option2, list);
			} else {
				System.out.println("operacja to" + option2);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				score score1 = new score(frame, option, option2, list, list2);
			}
		}
	};

	private void setOperation() {
		switch (option) {
		case 1: {
			setSize2(1, 1);
			break;
		}
		case 2: {
			setSize2(2, 2);
			break;
		}
		case 3: {
			setSize2(3, 3);
			break;
		}
		case 4: {
			setSize2(4, 4);
			break;
		}
		case 5: {
			setSize2(5, 5);
			break;
		}
		case 6: {
			setSize2(6, 6);
			break;
		}
		case 7: {
			setSize2(7, 7);
			break;
		}
		case 8: {
			setSize2(8, 8);
			break;
		}
		case 10: {
			setSize2(9, 9);
			break;
		}
		default: {
			System.out.println("Blad");
		}
		}

	}

	private void setSize2(int x, int y) {
		panel2.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				c.gridx = i;
				c.gridy = j;
				JTextField field = new JTextField(10);
				list.add(field);
				panel2.add(field, c);
			}
		}
	}

}
