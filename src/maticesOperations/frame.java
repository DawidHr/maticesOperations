package maticesOperations;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class frame extends JFrame {

frame() {
	super();
	setTitle("Dzia³ania na macierzach");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
	setSize(700, 200);
	main();
}

public void main() {
	MainPanel panel = new MainPanel(frame.this);
}
}
