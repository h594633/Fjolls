package no.hvl.dat100;

public class Oppg5 {
	public static void main(String[] Args) {
		int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("antall elever"));

		for (int i = 1; i <= n; ++i) {
			int score = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("antall poeng"));
			char rating = '#';

			if (score >= 0 && score <= 39) {
				rating = 'F';
			}
			if (score >= 40 && (score <= 49)) {
				rating = 'E';
			}
			if (score >= 50 && score <= 59) {
				rating = 'D';
			}
			if (score >= 60 && score <= 79) {
				rating = 'C';
			}
			if (score >= 80 && score <= 89) {
				rating = 'B';
			}
			if (score >= 90 && score <= 100) {
				rating = 'A';
			}

			if (score < 0 || score > 100) {
				javax.swing.JOptionPane.showMessageDialog(null, "Ugyldig verdi, velg verdi mellom 0 og 100.");
				--i;
			} else
				javax.swing.JOptionPane.showMessageDialog(null, "Karakter " + rating);

		}

	}

}
