package no.hvl.dat100;

public class Oppg4 {

	public static void main(String[] args) {
		String bruttoText = javax.swing.JOptionPane.showInputDialog("Brutto inntekt");
		int brutto = Integer.parseInt(bruttoText);

		double sats0 = 0.0;
		double sats1 = 0.0093;
		double sats2 = 0.0241;
		double sats3 = 0.1152;
		double sats4 = 0.1452;

		double skatt = 0;

		
		int trinn0 = 164100;
		int trinn1 = 230950;
		int trinn2 = 580650;
		int trinn3 = 934050;

		if (brutto <= trinn0) {
			skatt = brutto * sats0;
		}
		if (brutto > trinn0 && brutto <= trinn1) {
			skatt = (brutto - trinn0) * sats1;
		}
		if (brutto > trinn1 && brutto <= trinn2) {
			skatt = ((trinn1 - trinn0) * sats1) + 
					((brutto - trinn1) * sats2);
		}
		if (brutto > trinn2 && brutto <= trinn3) {
			skatt = ((trinn1 - trinn0) * sats1) + 
					((trinn2 - trinn1) * sats2) + 
					((brutto - trinn2) * sats3);
		}
		if (brutto > trinn3) {
			skatt = ((trinn1 - trinn0) * sats1) + 
					((trinn2 - trinn1) * sats2) + 
					((trinn3 - trinn2) * sats3) + 
					((brutto - trinn3) * sats4);
		}

		String svar = ("Brutto " + brutto + "\nTrinnskatt " + (int)(skatt+0.5));
		javax.swing.JOptionPane.showMessageDialog(null, svar);
		System.out.println(svar);

		


	}

}
