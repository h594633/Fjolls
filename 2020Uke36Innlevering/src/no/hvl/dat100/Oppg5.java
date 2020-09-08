package no.hvl.dat100;

public class Oppg5 {
	public static void main(String[] Args) {
		int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("antall elever"));

		for (int i = 1; i <= n; ++i) {
			int score = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("antall poeng"));
			char rating = '#';

			
			
			if (score < 0 || score > 100) {
				javax.swing.JOptionPane.showMessageDialog(null, "Ugyldig verdi, velg verdi mellom 0 og 100.");
				--i;
			} else {
				if (score >= 0 && score <= 39) {rating = 'F';}
				else if (score <= 49) {rating = 'E';}
				else if (score <= 59) {rating = 'D';}
				else if (score <= 79) {rating = 'C';}
				else if (score <= 89) {rating = 'B';}
				else if (score <= 100) {rating = 'A';}
				javax.swing.JOptionPane.showMessageDialog(null, "Karakter " + rating );
			}
		
			


		}

	}

}