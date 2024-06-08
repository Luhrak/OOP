package spiel.grafic;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import spiel.logic.Bermuda;
import spiel.logic.Brettspiel;

public class BermudaPanel extends JPanel implements ActionListener {

	private Brettspiel spiel;
	private int a; 
	private int b; 
	private int h; 

	public BermudaPanel(int a, int b, int h) {
		
		this.a = a; 
		this.b = b; 
		this.h = h; 

		spiel = new Bermuda(a, b, h);
		this.setLayout(new GridLayout(h, b));

		for (int y = 0; y < h; y++) {
			for (int x = 0; x < b; x++) {

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

			if (spiel.istGewonnen()) {

				JOptionPane.showMessageDialog(this, "Herzlichen Glückwunsch, Sie haben gewonnen!");
				
				// Gewollte Lösung: this.spiel = new Bermuda(this.a, this.b, this.h); 
				
				// save parent before deleting itself and then redo the pannel 
				Container parent = this.getParent(); 
				parent.remove(this);
				parent.add(new BermudaPanel(this.a, this.b, this.h));
				parent.revalidate();

			}
		}

	}

}
