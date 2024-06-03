package spiel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BermudaPanel extends JPanel implements ActionListener {

	Brettspiel spiel;

	public BermudaPanel(int a, int b, int h) {

		this.setVisible(true);
		spiel = new Bermuda(a, b, h);
		this.setLayout(new GridLayout(h, b));

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < h; j++) {

				String butName = Character.toString(spiel.getFeld(i, j));
				Kachel button = new Kachel(butName, i, j);
				button.addActionListener(this);
				this.add(button);
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (!spiel.istEnde());
		Kachel k = (Kachel) e.getSource();
		spiel.waehle(k.koordinate.getX(), k.koordinate.getY());
		k.setText(Character.toString(spiel.getFeld(k.koordinate.getX(), k.koordinate.getY())));
	
		if (spiel.istGewonnen()) {
			JOptionPane.showMessageDialog(this, "Herzlichen Glückwunsch, Sie haben gewonnen!");
		}
		
		
	}

}


