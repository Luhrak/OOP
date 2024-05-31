package spiel;

import javax.swing.JFrame;

public class BermudaFrame extends JFrame {

	public BermudaFrame() {

		this.setSize(900, 700);
		this.setTitle("Bermuda");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Brettspiel spiel = new Bermuda(4, 9, 7);

		add(new BermudaPanel(spiel, 9, 7));
		this.setVisible(true);

	}

	public static void main(String[] args) {

		BermudaFrame frame = new BermudaFrame();

	}

}
