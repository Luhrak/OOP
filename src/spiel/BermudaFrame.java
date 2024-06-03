package spiel;

import java.awt.Dimension;

import javax.swing.JFrame;

public class BermudaFrame extends JFrame {

	public BermudaFrame() {

		this.setVisible(true);
		this.setSize(900, 700);
		this.setMinimumSize(new Dimension(450, 350));
		this.setTitle("Bermuda");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// TODO: make these ints user inputs instead  
		add(new BermudaPanel(4, 9, 7));

	}

	public static void main(String[] args) {

		BermudaFrame frame = new BermudaFrame();

	}

}
