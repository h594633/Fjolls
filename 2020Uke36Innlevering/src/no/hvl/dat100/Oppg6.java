package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg6 {
	public static void main(String[] Args) {

		for (int j = 0; j < 1; j++) {
			int n = Integer.parseInt(showInputDialog("Gi et heltall fra 0 til og med 20"));
			long x = 1;

			if (n < 0 || n >= 21) {
				showMessageDialog(null, n + " er ugyldig verdi");
				--j;
			} else {

				for (int i = 1; i <= n; ++i) {
					x *= i;
					System.out.println(x);
				}

				if (n == 0) {
					showMessageDialog(null, "!0 = 1");
				} else {
					showMessageDialog(null, "!" + n + " = " + x);
				}
			}
		}
	}
}
