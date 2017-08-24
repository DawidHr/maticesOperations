package maticesOperations;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class score2 {
JFrame frame;
int c;
int v;

ArrayList<JTextField> list = new ArrayList<JTextField>();
ArrayList<JTextField> list2 = new ArrayList<JTextField>();

int listI[][];
int listII[][] = new int[v][c];



JPanel panel1 = new JPanel();
JPanel panel2 = new JPanel();

JLabel text = new JLabel("WYNIK");

ArrayList<Integer> proba = new ArrayList<>();

	score2(JFrame frame, int v, int c, ArrayList<JTextField> list, ArrayList<JTextField> list2) {
		this.frame=frame;
		this.list=list2;
		this.list2=list;
		this.c=c+1;
		this.v=v+1;
		listI = new int[this.c][this.v];
		listII = new int[this.v][this.c];
		main();	
	}
	
	
	
	public void main() {
		setPanel1();
		setPanel2();
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.pack();
	}
	
	private void setPanel1() {
		panel1.add(text);
	}
	
	private void setPanel2() {
		listI = change(list,c,v);
		listII = change(list2,v,c);
		boolean s = count();
		if(s) setSize2(c,c);
		else errorMessage();
	}
	
	public int[][] change(ArrayList<JTextField> list, int col1, int row1 ) {
		int listt[][] = new int[row1][col1];
		int row2=0;
		int col2=0;
		for(int i=0; i<list.size(); i++) {
			int x = Integer.parseInt(list.get(i).getText());
			System.out.println("Row="+row2+" Col="+col2);
			listt[row2][col2] = x;
			if(row2==row1 && col1==col2)
				System.out.println("B³ad. Za duzo danych do przerobienia");
			col2=col2+1;
			if(col2!=0 && (col1 - col2)==0) {
				row2++;
				col2=0;
			}
		
	}
		return listt;
		
	}
		
	private boolean count() {
		try {		
			
				calculateField2();
				return true;
		}
		catch(Exception e) {
		System.out.println("blad");
		return false;	
		}
		
		
	}
		
	private void calculateField2() {
		for(int ww=0;ww<c;ww++) {
		for(int row=0; row<c;row++) {	
		int wynik=0;
			for(int col=0;col<c;col++) {	
				int s = listI[ww][col] * listII[col][row];
				wynik=wynik+s;	
			}
			proba.add(wynik);
			wynik=0;

		
	}}
		}
	
	
	private void setSize2(int x, int y) {
		panel2.setLayout(new GridBagLayout());
		GridBagConstraints c =new GridBagConstraints();
		int k=0;
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				c.gridx=i;
				c.gridy=j;
				panel2.add(new JTextField(proba.get(k).toString()), c);
				k++;
			}
		}	
	}
	
	private void errorMessage() {
		panel2.add(new JLabel("Poda³es b³êdne dane podczas wype³niania formularza"));	
	}
}

