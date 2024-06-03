package spiel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

class Kachel extends JButton {

	Koordinate koordinate;

	public Kachel(String name, int x, int y) {

		super(name);
		this.koordinate = new Koordinate(x, y);

		this.setBorderPainted(false);
		this.setBackground(new Color(35,140,240));
		this.setForeground(Color.lightGray);
		this.setFont(new Font("Comic Sans ms", Font.PLAIN, 30));
		
		Kachel delegate = this;
		this.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				delegate.setForeground(new Color(230, 230, 230));
			}

			public void mouseExited(MouseEvent evt) {
				delegate.setForeground(Color.LIGHT_GRAY);
			}
		});

	}

	public void paintComponent(Graphics g) {

		int w = this.getWidth();
		int h = this.getHeight();

		// super.paintComponent(g);
		g.clearRect(0, 0, w, h);

		g.setColor(this.getBackground());
		g.fillRect(0, 0, w, h);

		g.setColor(Color.BLACK);
		g.drawLine(0, 0, w, h);
		g.drawLine(0, h, w, 0);
		g.drawLine(0, h / 2, w, h / 2);
		g.drawLine(w / 2, 0, w / 2, h);

		g.setColor(this.getForeground());
		g.fillOval(15, 15, w - 30, h - 30);

		g.setColor(Color.BLACK);
		g.drawOval(15, 15, w - 30, h - 30);

		if (this.getText().equals("X")) {
			g.setColor(new Color(150, 10, 10));
		}
		g.drawString(this.getText(), (w-15) / 2 , (h+25) / 2);

	}
}
