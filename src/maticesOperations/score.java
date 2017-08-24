package maticesOperations;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class score {
JFrame frame;
int option;
ArrayList<JTextField> list;
ArrayList<JTextField> list2;
ArrayList<JTextField> score1 = new ArrayList<JTextField>();
JPanel panel = new JPanel();
JPanel panel1 = new JPanel();
JPanel panel2 = new JPanel();
JLabel text = new JLabel("WYNIK");
int option2;

	score(JFrame frame, int option, int option2, ArrayList<JTextField> list, ArrayList<JTextField> list2) {
		this.frame=frame;
		this.option=option;
		this.option2=option2;
		System.out.println("Opcja to "+option2);
		this.list=list;
		this.list2=list2;
		main();
	}
	
	public void main() {
		setPanel1();
		setPanel2();
		panel.add(panel1,BorderLayout.NORTH);
		panel.add(panel2, BorderLayout.CENTER);
		frame.add(panel);
	}
	
	private void setPanel1() {
		panel1.add(text);
	}
	
	private void setPanel2() {

		boolean s = count();
		if(s) setOperation();
		else errorMessage();
	}
	
	private boolean count() {
		try {
			for(int x=0; x<list2.size(); x++) {
				String s = list.get(x).getText();
				int i = Integer.parseInt(s);
				String kk = list2.get(x).getText();
				int j = Integer.parseInt(kk);
				System.out.println("Opcja: "+option2+"\n"+i+"  j="+j);
				if(option2==1) {
				i = i+j;
				score1.add(new JTextField(i+""));	}
				else if(option2==2 && i>=j) {
				i=i-j;
						score1.add(new JTextField(i+""));	}
				else
			score1.add(new JTextField("Blad"));	
				
			}

			return true;	
		}
		catch(Exception e) {
		System.out.println("blad");
		return false;	
		}
		
		
	}
	private void setOperation() {
		switch(option) {
		case 1 : {setSize2(1,1);
			break;
		}
		case 2 : {setSize2(2,2);
		break;	
		}
		case 3 : {setSize2(3,3);
		break;	
		}
		case 4 : {setSize2(4,4);
		break;	
		}
		case 5 : {setSize2(5,5);
		break;	
		}
		case 6 : {setSize2(6,6);
		break;	
		}
		case 7 : {setSize2(7,7);
		break;	
		}
		case 8 : {setSize2(8,8);
		break;	
		}
		case 10 : {setSize2(9,9);
		break;	
		}
		default: {
			System.out.println("Blad");
		}
		}
		
	}

	private void setSize2(int x, int y) {
		panel2.setLayout(new GridBagLayout());
		GridBagConstraints c =new GridBagConstraints();
		int k=0;
		for(int i=0;i<=x;i++) {
			for(int j=0;j<=y;j++) {
				c.gridx=i;
				c.gridy=j;
				panel2.add(score1.get(k), c);
				k++;
			}
		}	
	}
	
	private void errorMessage() {
		panel2.add(new JLabel("Poda³es b³êdne dane podczas wype³niania formularza"));	
	}
}
