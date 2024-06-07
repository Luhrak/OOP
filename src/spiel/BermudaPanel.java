package spiel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BermudaPanel extends JPanel implements ActionListener {

	Brettspiel spiel;

	public BermudaPanel(int a, int b, int h) {

		spiel = new Bermuda(a, b, h);
		this.setLayout(new GridLayout(b, h));

		for (int x = 0; x < b; x++) {
			for (int y = 0; y < h; y++) {

				String butName = Character.toString(spiel.getFeld(x, y));
				Kachel button = new Kachel(butName, x, y);
				button.addActionListener(this);
				this.add(button);
			}
			
		}

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (!spiel.istEnde()) {
		
		Kachel k = (Kachel) e.getSource();
		spiel.waehle(k.koordinate.getX(), k.koordinate.getY());
		k.setText(Character.toString(spiel.getFeld(k.koordinate.getX(), k.koordinate.getY())));
		}
		
		if (spiel.istGewonnen()) {

			
			JOptionPane.showMessageDialog(this, "Herzlichen Glückwunsch, Sie haben gewonnen!");
		}

	}

}
