package spiel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BermudaPanel extends JPanel implements ActionListener {

	Brettspiel spiel;

	public BermudaPanel(Brettspiel spiel, int w, int h) {

		this.spiel = spiel;

		this.setLayout(new GridLayout(h, w));

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {

				String butName = Character.toString(spiel.getFeld(i, j));
				JButton button = new Kachel(butName, i, j);
				button.addActionListener(this);
				this.add(button);
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Kachel k = (Kachel) e.getSource();
		spiel.waehle(k.koordinate.getX(), k.koordinate.getY());
		k.setText(Character.toString(spiel.getFeld(k.koordinate.getX(), k.koordinate.getY())));
	}

}

class Kachel extends JButton {

	Koordinate koordinate;

	public Kachel(String name, int x, int y) {

		super(name);
		this.koordinate = new Koordinate(x, y);
	}
}
