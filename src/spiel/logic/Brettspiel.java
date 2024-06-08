package spiel.logic;

public interface Brettspiel {
// Liefert die Groesse des Spielfelds
	int getHoehe();

	int getBreite();

// die Abfragen zum Spielende und ob gewonnen wurde
	boolean istEnde();

	boolean istGewonnen();

// f¨ur die Anzeige des Spielfelds
	char getFeld(int x, int y);

// f¨ur die Interaktion mit dem Spieler
	void waehle(int x, int y);
}