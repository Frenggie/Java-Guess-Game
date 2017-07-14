package new1;

import java.util.Random;
import javax.swing.JOptionPane;

public class guess_game {
	
	private int zufallszahl;
	private int ratezahl;
	
	guess_game() {
		ratezahl = -1;
	}
	
	void setZufallszahl(int z) {
		zufallszahl = z;
	}
	
	int getZufallszahl() {
		return zufallszahl;
	}
	
	void setRatezahl(int z) {
		ratezahl = z;
	}
	
	int getRatezahl() {
		return ratezahl;
	}
	
	
	
	public static void main(String[] args) {
		guess_game spiel;
		spiel = new guess_game();
		boolean geraten = false;
		int versuchszähler = 0;
		JOptionPane.showMessageDialog(null, "Erraten sie eine ganze Zahl aus dem Bereich von 1 bis 100!");
		Random randomGenerator = new Random();
		spiel.setZufallszahl(randomGenerator.nextInt(101));
		while (!geraten) {
			spiel.setRatezahl(Integer.parseInt(JOptionPane.showInputDialog("Welche Zahl wird gesucht?")));
			versuchszähler++;
			if (spiel.getRatezahl() < spiel.getZufallszahl()) {
				JOptionPane.showMessageDialog(null, "Ihre Zahl ist zu klein!");
			} else {
				if (spiel.getRatezahl() > spiel.getZufallszahl()) {
					JOptionPane.showMessageDialog(null, "Ihre Zahl ist zu groß!");
				} else {
					geraten = true;
					JOptionPane.showMessageDialog(null, "Glückwunsch! Sie haben die Zahl mit " + versuchszähler + " Versuchen erraten!");
				}
			}
		}
	}
}