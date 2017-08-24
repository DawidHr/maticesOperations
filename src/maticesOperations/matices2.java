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

public class matices2 {
	JFrame frame;
	int c;
	int v;
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JLabel text = new JLabel("Proszê wype³niæ macierz");
	JButton save = new JButton("Zapisz");
	ArrayList<JTextField> list = new ArrayList<>();
	ArrayList<JTextField> list2 = new ArrayList<>();
	boolean end = false;

	matices2(JFrame frame, int c, int v) {
		this.frame = frame;
		this.c = c;
		this.v = v;
		System.out.println("Matices c=" + c + " v=" + v);
		main();

	}

	matices2(JFrame frame, int c, int v, ArrayList<JTextField> list) {
		this.frame = frame;
		this.c = c;
		this.v = v;
		list2.addAll(list);
		end = true;
		list.removeAll(list);
		System.out.println("Matices2 c=" + c + " v=" + v);
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
		setSize2(c, v);
	}

	private void setPanel3() {
		panel3.add(save);
		save.addActionListener(listener);
	}

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (end == false) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				System.out.println("v=" + v + "c=" + c);
				matices2 start = new matices2(frame, v, c, list);
			} else {
				System.out.println("tu jestm");
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				score2 score1 = new score2(frame, c, v, list, list2);
			}
		}
	};

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
